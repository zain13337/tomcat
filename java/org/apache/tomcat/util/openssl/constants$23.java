/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$23 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$23() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "SSL_get_ciphers",
        constants$2.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "SSL_CTX_get_ciphers",
        constants$2.const$4
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SSL_do_handshake",
        constants$0.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SSL_renegotiate",
        constants$0.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "SSL_renegotiate_pending",
        constants$0.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "SSL_shutdown",
        constants$0.const$0
    );
}


