/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/BatchGetFindingDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetFindingDetailsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of finding ARNs.
     * </p>
     */
    private java.util.List<String> findingArns;

    /**
     * <p>
     * A list of finding ARNs.
     * </p>
     * 
     * @return A list of finding ARNs.
     */

    public java.util.List<String> getFindingArns() {
        return findingArns;
    }

    /**
     * <p>
     * A list of finding ARNs.
     * </p>
     * 
     * @param findingArns
     *        A list of finding ARNs.
     */

    public void setFindingArns(java.util.Collection<String> findingArns) {
        if (findingArns == null) {
            this.findingArns = null;
            return;
        }

        this.findingArns = new java.util.ArrayList<String>(findingArns);
    }

    /**
     * <p>
     * A list of finding ARNs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingArns(java.util.Collection)} or {@link #withFindingArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param findingArns
     *        A list of finding ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFindingDetailsRequest withFindingArns(String... findingArns) {
        if (this.findingArns == null) {
            setFindingArns(new java.util.ArrayList<String>(findingArns.length));
        }
        for (String ele : findingArns) {
            this.findingArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of finding ARNs.
     * </p>
     * 
     * @param findingArns
     *        A list of finding ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFindingDetailsRequest withFindingArns(java.util.Collection<String> findingArns) {
        setFindingArns(findingArns);
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
        if (getFindingArns() != null)
            sb.append("FindingArns: ").append(getFindingArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetFindingDetailsRequest == false)
            return false;
        BatchGetFindingDetailsRequest other = (BatchGetFindingDetailsRequest) obj;
        if (other.getFindingArns() == null ^ this.getFindingArns() == null)
            return false;
        if (other.getFindingArns() != null && other.getFindingArns().equals(this.getFindingArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindingArns() == null) ? 0 : getFindingArns().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetFindingDetailsRequest clone() {
        return (BatchGetFindingDetailsRequest) super.clone();
    }

}
