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
package jetbrains.exodus.tree.patricia

import jetbrains.exodus.ByteIterable

internal interface NodeChildren : Iterable<ChildReference?> {
    override fun iterator(): NodeChildrenIterator
}

internal interface NodeChildrenIterator : MutableIterator<ChildReference?> {
    fun hasPrev(): Boolean
    fun prev(): ChildReference?
    val isMutable: Boolean
    fun nextInPlace()
    fun prevInPlace()
    val node: ChildReference?
    val parentNode: NodeBase?
    val index: Int
    val key: ByteIterable?
}