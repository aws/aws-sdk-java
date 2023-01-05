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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/BatchGetMembershipDatasources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetMembershipDatasourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the behavior graph.
     * </p>
     */
    private java.util.List<String> graphArns;

    /**
     * <p>
     * The ARN of the behavior graph.
     * </p>
     * 
     * @return The ARN of the behavior graph.
     */

    public java.util.List<String> getGraphArns() {
        return graphArns;
    }

    /**
     * <p>
     * The ARN of the behavior graph.
     * </p>
     * 
     * @param graphArns
     *        The ARN of the behavior graph.
     */

    public void setGraphArns(java.util.Collection<String> graphArns) {
        if (graphArns == null) {
            this.graphArns = null;
            return;
        }

        this.graphArns = new java.util.ArrayList<String>(graphArns);
    }

    /**
     * <p>
     * The ARN of the behavior graph.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGraphArns(java.util.Collection)} or {@link #withGraphArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param graphArns
     *        The ARN of the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetMembershipDatasourcesRequest withGraphArns(String... graphArns) {
        if (this.graphArns == null) {
            setGraphArns(new java.util.ArrayList<String>(graphArns.length));
        }
        for (String ele : graphArns) {
            this.graphArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARN of the behavior graph.
     * </p>
     * 
     * @param graphArns
     *        The ARN of the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetMembershipDatasourcesRequest withGraphArns(java.util.Collection<String> graphArns) {
        setGraphArns(graphArns);
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
        if (getGraphArns() != null)
            sb.append("GraphArns: ").append(getGraphArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetMembershipDatasourcesRequest == false)
            return false;
        BatchGetMembershipDatasourcesRequest other = (BatchGetMembershipDatasourcesRequest) obj;
        if (other.getGraphArns() == null ^ this.getGraphArns() == null)
            return false;
        if (other.getGraphArns() != null && other.getGraphArns().equals(this.getGraphArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGraphArns() == null) ? 0 : getGraphArns().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetMembershipDatasourcesRequest clone() {
        return (BatchGetMembershipDatasourcesRequest) super.clone();
    }

}
