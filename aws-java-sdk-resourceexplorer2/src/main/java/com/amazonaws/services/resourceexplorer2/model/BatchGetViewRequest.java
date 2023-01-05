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
package com.amazonaws.services.resourceexplorer2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/BatchGetView" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetViewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     * names (ARNs)</a> that identify the views you want details for.
     * </p>
     */
    private java.util.List<String> viewArns;

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     * names (ARNs)</a> that identify the views you want details for.
     * </p>
     * 
     * @return A list of <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         resource names (ARNs)</a> that identify the views you want details for.
     */

    public java.util.List<String> getViewArns() {
        return viewArns;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     * names (ARNs)</a> that identify the views you want details for.
     * </p>
     * 
     * @param viewArns
     *        A list of <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        resource names (ARNs)</a> that identify the views you want details for.
     */

    public void setViewArns(java.util.Collection<String> viewArns) {
        if (viewArns == null) {
            this.viewArns = null;
            return;
        }

        this.viewArns = new java.util.ArrayList<String>(viewArns);
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     * names (ARNs)</a> that identify the views you want details for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setViewArns(java.util.Collection)} or {@link #withViewArns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param viewArns
     *        A list of <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        resource names (ARNs)</a> that identify the views you want details for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetViewRequest withViewArns(String... viewArns) {
        if (this.viewArns == null) {
            setViewArns(new java.util.ArrayList<String>(viewArns.length));
        }
        for (String ele : viewArns) {
            this.viewArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     * names (ARNs)</a> that identify the views you want details for.
     * </p>
     * 
     * @param viewArns
     *        A list of <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        resource names (ARNs)</a> that identify the views you want details for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetViewRequest withViewArns(java.util.Collection<String> viewArns) {
        setViewArns(viewArns);
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
        if (getViewArns() != null)
            sb.append("ViewArns: ").append(getViewArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetViewRequest == false)
            return false;
        BatchGetViewRequest other = (BatchGetViewRequest) obj;
        if (other.getViewArns() == null ^ this.getViewArns() == null)
            return false;
        if (other.getViewArns() != null && other.getViewArns().equals(this.getViewArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getViewArns() == null) ? 0 : getViewArns().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetViewRequest clone() {
        return (BatchGetViewRequest) super.clone();
    }

}
