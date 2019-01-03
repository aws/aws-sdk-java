/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.codegen.model.intermediate;

import com.amazonaws.codegen.internal.Utils;

import java.util.List;

public class WaiterDefinitionModel {

    private String waiterName;

    private int delay;

    private int maxAttempts;

    private List<AcceptorModel> acceptors;

    private OperationModel operationModel;

    public String getWaiterName() {
        return this.waiterName;
    }

    public void setWaiterName(String waiterName) {
        this.waiterName = waiterName;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }

    public void setMaxAttempts(int maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    public String getWaiterMethodName(){
        return Utils.unCapitialize(this.waiterName);
    }

    public List<AcceptorModel> getAcceptors() {
        return acceptors;
    }

    public void setAcceptors(List<AcceptorModel> acceptors) {
        this.acceptors = acceptors;
    }

    public String getOperationName(){
        return this.operationModel.getOperationName();
    }

    public OperationModel getOperationModel() {
        return operationModel;
    }

    public void setOperationModel(OperationModel operationModel) {
        this.operationModel = operationModel;
    }

    public String getOperationMethodName(){
        return Utils.unCapitialize(this.operationModel.getOperationName());
    }
}
