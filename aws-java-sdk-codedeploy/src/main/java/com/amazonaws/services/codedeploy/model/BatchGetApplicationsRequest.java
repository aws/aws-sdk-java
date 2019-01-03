/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a BatchGetApplications operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetApplications" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetApplicationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of application names separated by spaces.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> applicationNames;

    /**
     * <p>
     * A list of application names separated by spaces.
     * </p>
     * 
     * @return A list of application names separated by spaces.
     */

    public java.util.List<String> getApplicationNames() {
        if (applicationNames == null) {
            applicationNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return applicationNames;
    }

    /**
     * <p>
     * A list of application names separated by spaces.
     * </p>
     * 
     * @param applicationNames
     *        A list of application names separated by spaces.
     */

    public void setApplicationNames(java.util.Collection<String> applicationNames) {
        if (applicationNames == null) {
            this.applicationNames = null;
            return;
        }

        this.applicationNames = new com.amazonaws.internal.SdkInternalList<String>(applicationNames);
    }

    /**
     * <p>
     * A list of application names separated by spaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationNames(java.util.Collection)} or {@link #withApplicationNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param applicationNames
     *        A list of application names separated by spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetApplicationsRequest withApplicationNames(String... applicationNames) {
        if (this.applicationNames == null) {
            setApplicationNames(new com.amazonaws.internal.SdkInternalList<String>(applicationNames.length));
        }
        for (String ele : applicationNames) {
            this.applicationNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of application names separated by spaces.
     * </p>
     * 
     * @param applicationNames
     *        A list of application names separated by spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetApplicationsRequest withApplicationNames(java.util.Collection<String> applicationNames) {
        setApplicationNames(applicationNames);
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
        if (getApplicationNames() != null)
            sb.append("ApplicationNames: ").append(getApplicationNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetApplicationsRequest == false)
            return false;
        BatchGetApplicationsRequest other = (BatchGetApplicationsRequest) obj;
        if (other.getApplicationNames() == null ^ this.getApplicationNames() == null)
            return false;
        if (other.getApplicationNames() != null && other.getApplicationNames().equals(this.getApplicationNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationNames() == null) ? 0 : getApplicationNames().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetApplicationsRequest clone() {
        return (BatchGetApplicationsRequest) super.clone();
    }

}
