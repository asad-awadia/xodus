/*
 * Copyright ${inceptionYear} - ${year} ${owner}
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.exodus.entitystore.tables;

import jetbrains.exodus.entitystore.PersistentEntityStoreImpl;
import jetbrains.exodus.entitystore.PersistentStoreTransaction;
import jetbrains.exodus.env.Store;
import jetbrains.exodus.env.StoreConfig;
import org.jetbrains.annotations.NotNull;

public class SingleColumnTable extends Table {

    @NotNull
    private final Store database;

    public SingleColumnTable(@NotNull final PersistentStoreTransaction txn,
                             @NotNull final String name,
                             @NotNull final StoreConfig config) {
        final PersistentEntityStoreImpl store = txn.getStore();
        database = store.getEnvironment().openStore(name, config, txn.getEnvironmentTransaction());
        store.trackTableCreation(database, txn);
    }

    @NotNull
    public Store getDatabase() {
        return database;
    }

    @Override
    public boolean canBeCached() {
        return !database.getConfig().temporaryEmpty;
    }
}
