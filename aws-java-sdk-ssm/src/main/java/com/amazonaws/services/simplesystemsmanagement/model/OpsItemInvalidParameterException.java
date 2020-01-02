/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simplesystemsmanagement.model;

import javax.annotation.Generated;

/**
 * <p>
 * A specified parameter argument isn't valid. Verify the available arguments and try again.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpsItemInvalidParameterException extends com.amazonaws.services.simplesystemsmanagement.model.AWSSimpleSystemsManagementException {
    private static final long serialVersionUID = 1L;

    private com.amazonaws.internal.SdkInternalList<String> parameterNames;

    /**
     * Constructs a new OpsItemInvalidParameterException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public OpsItemInvalidParameterException(String message) {
        super(message);
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ParameterNames")
    public java.util.List<String> getParameterNames() {
        if (parameterNames == null) {
            parameterNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return parameterNames;
    }

    /**
     * @param parameterNames
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ParameterNames")
    public void setParameterNames(java.util.Collection<String> parameterNames) {
        if (parameterNames == null) {
            this.parameterNames = null;
            return;
        }

        this.parameterNames = new com.amazonaws.internal.SdkInternalList<String>(parameterNames);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterNames(java.util.Collection)} or {@link #withParameterNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param parameterNames
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemInvalidParameterException withParameterNames(String... parameterNames) {
        if (this.parameterNames == null) {
            setParameterNames(new com.amazonaws.internal.SdkInternalList<String>(parameterNames.length));
        }
        for (String ele : parameterNames) {
            this.parameterNames.add(ele);
        }
        return this;
    }

    /**
     * @param parameterNames
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemInvalidParameterException withParameterNames(java.util.Collection<String> parameterNames) {
        setParameterNames(parameterNames);
        return this;
    }

}
