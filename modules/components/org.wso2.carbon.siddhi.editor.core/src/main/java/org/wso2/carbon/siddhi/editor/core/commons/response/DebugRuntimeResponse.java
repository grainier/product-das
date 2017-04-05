/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.siddhi.editor.core.commons.response;

import java.util.Set;

/**
 * Response wrapper for Meta Data
 */
public class DebugRuntimeResponse extends GeneralResponse {
    private String runtimeId;
    private Set<String> streams;

    public DebugRuntimeResponse(Status status, String msg, String runtimeId, Set<String> streams) {
        super(status, msg);
        this.runtimeId = runtimeId;
        this.streams = streams;
    }

    public DebugRuntimeResponse(Status status, String msg) {
        super(status, msg);
    }

    public String getRuntimeId() {
        return runtimeId;
    }

    public Set<String> getStreams() {
        return streams;
    }
}
