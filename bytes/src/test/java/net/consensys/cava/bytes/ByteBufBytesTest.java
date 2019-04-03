/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE
 * file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file
 * to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.apache.tuweni.bytes;

import io.netty.buffer.Unpooled;

class ByteBufBytesTest extends CommonBytesTests {

  @Override
  Bytes h(String hex) {
    return Bytes.wrapByteBuf(Unpooled.copiedBuffer(Bytes.fromHexString(hex).toArrayUnsafe()));
  }

  @Override
  MutableBytes m(int size) {
    return MutableBytes.wrapByteBuf(Unpooled.copiedBuffer(new byte[size]));
  }

  @Override
  Bytes w(byte[] bytes) {
    return Bytes.wrapByteBuf(Unpooled.copiedBuffer(Bytes.of(bytes).toArray()));
  }

  @Override
  Bytes of(int... bytes) {
    return Bytes.wrapByteBuf(Unpooled.copiedBuffer(Bytes.of(bytes).toArray()));
  }
}
