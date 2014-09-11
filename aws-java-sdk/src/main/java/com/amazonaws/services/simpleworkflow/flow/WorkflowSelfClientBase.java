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
package com.amazonaws.services.simpleworkflow.flow;

import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;


public abstract class WorkflowSelfClientBase implements WorkflowSelfClient {
    
    protected DataConverter dataConverter;

    protected StartWorkflowOptions schedulingOptions;

    protected GenericWorkflowClient genericClient;
    
    protected final DecisionContextProvider decisionContextProvider = new DecisionContextProviderImpl();
    
    public WorkflowSelfClientBase(GenericWorkflowClient genericClient, 
            DataConverter dataConverter, StartWorkflowOptions schedulingOptions) {
        this.genericClient = genericClient;
        
        if (dataConverter == null) {
            this.dataConverter = new JsonDataConverter();
        }
        else {
            this.dataConverter = dataConverter;
        }
        
        if (schedulingOptions == null) {
            this.schedulingOptions = new StartWorkflowOptions();
        }
        else {
            this.schedulingOptions = schedulingOptions;
        }
    }

    @Override
    public DataConverter getDataConverter() {
        return dataConverter;
    }

    @Override
    public void setDataConverter(DataConverter converter) {
        this.dataConverter = converter;
    }

    @Override
    public StartWorkflowOptions getSchedulingOptions() {
        return schedulingOptions;
    }

    @Override
    public void setSchedulingOptions(StartWorkflowOptions schedulingOptions) {
        this.schedulingOptions = schedulingOptions;
    }

    @Override
    public GenericWorkflowClient getGenericClient() {
        return genericClient;
    }

    @Override
    public void setGenericClient(GenericWorkflowClient genericClient) {
        this.genericClient = genericClient;
    }
}
