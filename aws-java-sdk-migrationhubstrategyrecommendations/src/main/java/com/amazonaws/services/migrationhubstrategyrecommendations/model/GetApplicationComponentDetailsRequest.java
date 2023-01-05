/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetApplicationComponentDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApplicationComponentDetailsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application component. The ID is unique within an AWS account.
     * </p>
     */
    private String applicationComponentId;

    /**
     * <p>
     * The ID of the application component. The ID is unique within an AWS account.
     * </p>
     * 
     * @param applicationComponentId
     *        The ID of the application component. The ID is unique within an AWS account.
     */

    public void setApplicationComponentId(String applicationComponentId) {
        this.applicationComponentId = applicationComponentId;
    }

    /**
     * <p>
     * The ID of the application component. The ID is unique within an AWS account.
     * </p>
     * 
     * @return The ID of the application component. The ID is unique within an AWS account.
     */

    public String getApplicationComponentId() {
        return this.applicationComponentId;
    }

    /**
     * <p>
     * The ID of the application component. The ID is unique within an AWS account.
     * </p>
     * 
     * @param applicationComponentId
     *        The ID of the application component. The ID is unique within an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationComponentDetailsRequest withApplicationComponentId(String applicationComponentId) {
        setApplicationComponentId(applicationComponentId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationComponentId() != null)
            sb.append("ApplicationComponentId: ").append(getApplicationComponentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApplicationComponentDetailsRequest == false)
            return false;
        GetApplicationComponentDetailsRequest other = (GetApplicationComponentDetailsRequest) obj;
        if (other.getApplicationComponentId() == null ^ this.getApplicationComponentId() == null)
            return false;
        if (other.getApplicationComponentId() != null && other.getApplicationComponentId().equals(this.getApplicationComponentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationComponentId() == null) ? 0 : getApplicationComponentId().hashCode());
        return hashCode;
    }

    @Override
    public GetApplicationComponentDetailsRequest clone() {
        return (GetApplicationComponentDetailsRequest) super.clone();
    }

}
