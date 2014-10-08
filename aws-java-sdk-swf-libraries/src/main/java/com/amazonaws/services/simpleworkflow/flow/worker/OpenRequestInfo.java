/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.worker;

import com.amazonaws.services.simpleworkflow.flow.core.ExternalTaskCompletionHandle;
import com.amazonaws.services.simpleworkflow.flow.core.Settable;

class OpenRequestInfo<T, C> {

    ExternalTaskCompletionHandle completionHandle;

    final Settable<T> result = new Settable<T>();
    
    final C userContext;

    OpenRequestInfo() {
        userContext = null;
    }

    OpenRequestInfo(C userContext) {
        this.userContext = userContext;
    }

    ExternalTaskCompletionHandle getCompletionHandle() {
        return completionHandle;
    }

    void setCompletionHandle(ExternalTaskCompletionHandle context) {
        this.completionHandle = context;
    }

    Settable<T> getResult() {
        return result;
    }

    C getUserContext() {
        return userContext;
    }

    public void setResultDescription(String description) {
        result.setDescription(description);
    }

}