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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/UpdateIndexType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIndexTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the index that you want to update.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The type of the index. To understand the difference between <code>LOCAL</code> and <code>AGGREGATOR</code>, see
     * <a href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html">Turning on
     * cross-Region search</a> in the <i>Amazon Web Services Resource Explorer User Guide</i>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the index that you want to update.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of the index that you want to update.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the index that you want to update.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *         name (ARN)</a> of the index that you want to update.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the index that you want to update.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of the index that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIndexTypeRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The type of the index. To understand the difference between <code>LOCAL</code> and <code>AGGREGATOR</code>, see
     * <a href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html">Turning on
     * cross-Region search</a> in the <i>Amazon Web Services Resource Explorer User Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of the index. To understand the difference between <code>LOCAL</code> and <code>AGGREGATOR</code>
     *        , see <a
     *        href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html"
     *        >Turning on cross-Region search</a> in the <i>Amazon Web Services Resource Explorer User Guide</i>.
     * @see IndexType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the index. To understand the difference between <code>LOCAL</code> and <code>AGGREGATOR</code>, see
     * <a href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html">Turning on
     * cross-Region search</a> in the <i>Amazon Web Services Resource Explorer User Guide</i>.
     * </p>
     * 
     * @return The type of the index. To understand the difference between <code>LOCAL</code> and
     *         <code>AGGREGATOR</code>, see <a
     *         href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html"
     *         >Turning on cross-Region search</a> in the <i>Amazon Web Services Resource Explorer User Guide</i>.
     * @see IndexType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the index. To understand the difference between <code>LOCAL</code> and <code>AGGREGATOR</code>, see
     * <a href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html">Turning on
     * cross-Region search</a> in the <i>Amazon Web Services Resource Explorer User Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of the index. To understand the difference between <code>LOCAL</code> and <code>AGGREGATOR</code>
     *        , see <a
     *        href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html"
     *        >Turning on cross-Region search</a> in the <i>Amazon Web Services Resource Explorer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexType
     */

    public UpdateIndexTypeRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the index. To understand the difference between <code>LOCAL</code> and <code>AGGREGATOR</code>, see
     * <a href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html">Turning on
     * cross-Region search</a> in the <i>Amazon Web Services Resource Explorer User Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of the index. To understand the difference between <code>LOCAL</code> and <code>AGGREGATOR</code>
     *        , see <a
     *        href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html"
     *        >Turning on cross-Region search</a> in the <i>Amazon Web Services Resource Explorer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexType
     */

    public UpdateIndexTypeRequest withType(IndexType type) {
        this.type = type.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIndexTypeRequest == false)
            return false;
        UpdateIndexTypeRequest other = (UpdateIndexTypeRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIndexTypeRequest clone() {
        return (UpdateIndexTypeRequest) super.clone();
    }

}
