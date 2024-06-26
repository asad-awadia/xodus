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
package jetbrains.exodus.entitystore.management;

public interface EntityStoreConfigMBean {

    String OBJECT_NAME_PREFIX = "jetbrains.exodus.entitystore: type=EntityStoreConfig";

    boolean getRefactoringSkipAll();

    boolean getRefactoringNullIndices();

    boolean getRefactoringBlobNullIndices();

    int getEntityIterableCacheObsoleteMaxRetries();

    void setEntityIterableCacheObsoleteMaxRetries(int maxRetries);

    boolean getEntityIterableCacheHeavyEnabled();

    void setEntityIterableCacheHeavyEnabled(boolean heavyEnabled);

    boolean getRefactoringHeavyLinks();

    boolean getRefactoringHeavyProps();

    boolean getRefactoringDeleteRedundantBlobs();

    int getRefactoringDeduplicateBlobsEvery();

    int getRefactoringDeduplicateBlobsMinSize();

    int getMaxInPlaceBlobSize();

    void setMaxInPlaceBlobSize(int blobSize);

    boolean isBlobStringsCacheShared();

    long getBlobStringsCacheMaxValueSize();

    void setBlobStringsCacheMaxValueSize(long maxValueSize);

    boolean isCachingDisabled();

    void setCachingDisabled(boolean disabled);

    boolean isReorderingDisabled();

    void setReorderingDisabled(boolean disabled);

    boolean isExplainOn();

    boolean isDebugLinkDataGetter();

    boolean isDebugSearchForIncomingLinksOnDelete();

    void setDebugSearchForIncomingLinksOnDelete(boolean debug);

    boolean isDebugTestLinkedEntities();

    void setDebugTestLinkedEntities(boolean debug);

    boolean isDebugAllowInMemorySort();

    void setDebugAllowInMemorySort(boolean debug);

    int getEntityIterableCacheSize();

    void setEntityIterableCacheSize(int size);

    long getEntityIterableCacheWeight();

    int getEntityIterableCacheCountsCacheSize();

    long getEntityIterableCacheCountsLifeTime();

    void setEntityIterableCacheCountsLifeTime(long lifeTime);

    int getEntityIterableCacheThreadCount();

    long getEntityIterableCacheCachingTimeout();

    void setEntityIterableCacheCachingTimeout(long cachingTimeout);

    long getEntityIterableCacheCountsCachingTimeout();

    void setEntityIterableCacheCountsCachingTimeout(long cachingTimeout);

    long getEntityIterableCacheStartCachingTimeout();

    void setEntityIterableCacheStartCachingTimeout(long startCachingTimeout);

    boolean getEntityIterableCacheDeferredEnabled();

    void setEntityIterableCacheDeferredEnabled(boolean deferredEnabled);

    int getEntityIterableCacheDeferredSize();

    int getEntityIterableCacheDeferredDelay();

    void setEntityIterableCacheDeferredDelay(int deferredDelay);

    boolean getEntityIterableCacheUseHumanReadable();

    void setEntityIterableCacheUseHumanReadable(boolean useHumanReadable);

    int getEntityIterableCacheHeavyIterablesCacheSize();

    long getEntityIterableCacheHeavyIterablesLifeSpan();

    void setEntityIterableCacheHeavyIterablesLifeSpan(long lifeSpan);

    int getTransactionPropsCacheSize();

    void setTransactionPropsCacheSize(int transactionPropsCacheSize);

    int getTransactionLinksCacheSize();

    void setTransactionLinksCacheSize(int transactionLinksCacheSize);

    int getTransactionBlobStringsCacheSize();

    void setTransactionBlobStringsCacheSize(int transactionBlobStringsCacheSize);

    boolean getGatherStatistics();

    void startBlobsDeduplication();

    void close();
}
