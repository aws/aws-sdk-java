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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutQueryDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutQueryDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String name;

    private String queryDefinitionId;

    private com.amazonaws.internal.SdkInternalList<String> logGroupNames;

    private String queryString;

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutQueryDefinitionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param queryDefinitionId
     */

    public void setQueryDefinitionId(String queryDefinitionId) {
        this.queryDefinitionId = queryDefinitionId;
    }

    /**
     * @return
     */

    public String getQueryDefinitionId() {
        return this.queryDefinitionId;
    }

    /**
     * @param queryDefinitionId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutQueryDefinitionRequest withQueryDefinitionId(String queryDefinitionId) {
        setQueryDefinitionId(queryDefinitionId);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getLogGroupNames() {
        if (logGroupNames == null) {
            logGroupNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return logGroupNames;
    }

    /**
     * @param logGroupNames
     */

    public void setLogGroupNames(java.util.Collection<String> logGroupNames) {
        if (logGroupNames == null) {
            this.logGroupNames = null;
            return;
        }

        this.logGroupNames = new com.amazonaws.internal.SdkInternalList<String>(logGroupNames);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogGroupNames(java.util.Collection)} or {@link #withLogGroupNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param logGroupNames
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutQueryDefinitionRequest withLogGroupNames(String... logGroupNames) {
        if (this.logGroupNames == null) {
            setLogGroupNames(new com.amazonaws.internal.SdkInternalList<String>(logGroupNames.length));
        }
        for (String ele : logGroupNames) {
            this.logGroupNames.add(ele);
        }
        return this;
    }

    /**
     * @param logGroupNames
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutQueryDefinitionRequest withLogGroupNames(java.util.Collection<String> logGroupNames) {
        setLogGroupNames(logGroupNames);
        return this;
    }

    /**
     * @param queryString
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * @return
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * @param queryString
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutQueryDefinitionRequest withQueryString(String queryString) {
        setQueryString(queryString);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getQueryDefinitionId() != null)
            sb.append("QueryDefinitionId: ").append(getQueryDefinitionId()).append(",");
        if (getLogGroupNames() != null)
            sb.append("LogGroupNames: ").append(getLogGroupNames()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append(getQueryString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutQueryDefinitionRequest == false)
            return false;
        PutQueryDefinitionRequest other = (PutQueryDefinitionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getQueryDefinitionId() == null ^ this.getQueryDefinitionId() == null)
            return false;
        if (other.getQueryDefinitionId() != null && other.getQueryDefinitionId().equals(this.getQueryDefinitionId()) == false)
            return false;
        if (other.getLogGroupNames() == null ^ this.getLogGroupNames() == null)
            return false;
        if (other.getLogGroupNames() != null && other.getLogGroupNames().equals(this.getLogGroupNames()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getQueryDefinitionId() == null) ? 0 : getQueryDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getLogGroupNames() == null) ? 0 : getLogGroupNames().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        return hashCode;
    }

    @Override
    public PutQueryDefinitionRequest clone() {
        return (PutQueryDefinitionRequest) super.clone();
    }

}
