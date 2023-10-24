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
final class constants$19 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$19() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "SSL_CTX_use_certificate_chain_file",
        constants$12.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "SSL_load_client_CA_file",
        constants$2.const$4
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SSL_add_file_cert_subjects_to_stack",
        constants$12.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SSL_SESSION_get_time",
        constants$1.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "SSL_SESSION_get_id",
        constants$2.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "SSL_get1_peer_certificate",
        constants$2.const$4
    );
}


