/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddFlowSources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddFlowSourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The ARN of the flow that these sources were added to. */
    private String flowArn;
    /** The details of the newly added sources. */
    private java.util.List<Source> sources;

    /**
     * The ARN of the flow that these sources were added to.
     * 
     * @param flowArn
     *        The ARN of the flow that these sources were added to.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The ARN of the flow that these sources were added to.
     * 
     * @return The ARN of the flow that these sources were added to.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The ARN of the flow that these sources were added to.
     * 
     * @param flowArn
     *        The ARN of the flow that these sources were added to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddFlowSourcesResult withFlowArn(String flowArn) {
        setFlowArn(flowArn);
        return this;
    }

    /**
     * The details of the newly added sources.
     * 
     * @return The details of the newly added sources.
     */

    public java.util.List<Source> getSources() {
        return sources;
    }

    /**
     * The details of the newly added sources.
     * 
     * @param sources
     *        The details of the newly added sources.
     */

    public void setSources(java.util.Collection<Source> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<Source>(sources);
    }

    /**
     * The details of the newly added sources.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The details of the newly added sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddFlowSourcesResult withSources(Source... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<Source>(sources.length));
        }
        for (Source ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * The details of the newly added sources.
     * 
     * @param sources
     *        The details of the newly added sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddFlowSourcesResult withSources(java.util.Collection<Source> sources) {
        setSources(sources);
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
        if (getFlowArn() != null)
            sb.append("FlowArn: ").append(getFlowArn()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddFlowSourcesResult == false)
            return false;
        AddFlowSourcesResult other = (AddFlowSourcesResult) obj;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        return hashCode;
    }

    @Override
    public AddFlowSourcesResult clone() {
        try {
            return (AddFlowSourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
