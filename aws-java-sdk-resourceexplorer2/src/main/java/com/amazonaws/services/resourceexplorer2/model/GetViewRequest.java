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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/GetView" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetViewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the view that you want information about.
     * </p>
     */
    private String viewArn;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the view that you want information about.
     * </p>
     * 
     * @param viewArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of the view that you want information about.
     */

    public void setViewArn(String viewArn) {
        this.viewArn = viewArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the view that you want information about.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *         name (ARN)</a> of the view that you want information about.
     */

    public String getViewArn() {
        return this.viewArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the view that you want information about.
     * </p>
     * 
     * @param viewArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of the view that you want information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetViewRequest withViewArn(String viewArn) {
        setViewArn(viewArn);
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
        if (getViewArn() != null)
            sb.append("ViewArn: ").append(getViewArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetViewRequest == false)
            return false;
        GetViewRequest other = (GetViewRequest) obj;
        if (other.getViewArn() == null ^ this.getViewArn() == null)
            return false;
        if (other.getViewArn() != null && other.getViewArn().equals(this.getViewArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getViewArn() == null) ? 0 : getViewArn().hashCode());
        return hashCode;
    }

    @Override
    public GetViewRequest clone() {
        return (GetViewRequest) super.clone();
    }

}
