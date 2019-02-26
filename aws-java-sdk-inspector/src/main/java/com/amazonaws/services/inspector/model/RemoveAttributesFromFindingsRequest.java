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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/RemoveAttributesFromFindings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveAttributesFromFindingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARNs that specify the findings that you want to remove attributes from.
     * </p>
     */
    private java.util.List<String> findingArns;
    /**
     * <p>
     * The array of attribute keys that you want to remove from specified findings.
     * </p>
     */
    private java.util.List<String> attributeKeys;

    /**
     * <p>
     * The ARNs that specify the findings that you want to remove attributes from.
     * </p>
     * 
     * @return The ARNs that specify the findings that you want to remove attributes from.
     */

    public java.util.List<String> getFindingArns() {
        return findingArns;
    }

    /**
     * <p>
     * The ARNs that specify the findings that you want to remove attributes from.
     * </p>
     * 
     * @param findingArns
     *        The ARNs that specify the findings that you want to remove attributes from.
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
     * The ARNs that specify the findings that you want to remove attributes from.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingArns(java.util.Collection)} or {@link #withFindingArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param findingArns
     *        The ARNs that specify the findings that you want to remove attributes from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveAttributesFromFindingsRequest withFindingArns(String... findingArns) {
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
     * The ARNs that specify the findings that you want to remove attributes from.
     * </p>
     * 
     * @param findingArns
     *        The ARNs that specify the findings that you want to remove attributes from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveAttributesFromFindingsRequest withFindingArns(java.util.Collection<String> findingArns) {
        setFindingArns(findingArns);
        return this;
    }

    /**
     * <p>
     * The array of attribute keys that you want to remove from specified findings.
     * </p>
     * 
     * @return The array of attribute keys that you want to remove from specified findings.
     */

    public java.util.List<String> getAttributeKeys() {
        return attributeKeys;
    }

    /**
     * <p>
     * The array of attribute keys that you want to remove from specified findings.
     * </p>
     * 
     * @param attributeKeys
     *        The array of attribute keys that you want to remove from specified findings.
     */

    public void setAttributeKeys(java.util.Collection<String> attributeKeys) {
        if (attributeKeys == null) {
            this.attributeKeys = null;
            return;
        }

        this.attributeKeys = new java.util.ArrayList<String>(attributeKeys);
    }

    /**
     * <p>
     * The array of attribute keys that you want to remove from specified findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeKeys(java.util.Collection)} or {@link #withAttributeKeys(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param attributeKeys
     *        The array of attribute keys that you want to remove from specified findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveAttributesFromFindingsRequest withAttributeKeys(String... attributeKeys) {
        if (this.attributeKeys == null) {
            setAttributeKeys(new java.util.ArrayList<String>(attributeKeys.length));
        }
        for (String ele : attributeKeys) {
            this.attributeKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of attribute keys that you want to remove from specified findings.
     * </p>
     * 
     * @param attributeKeys
     *        The array of attribute keys that you want to remove from specified findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveAttributesFromFindingsRequest withAttributeKeys(java.util.Collection<String> attributeKeys) {
        setAttributeKeys(attributeKeys);
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
            sb.append("FindingArns: ").append(getFindingArns()).append(",");
        if (getAttributeKeys() != null)
            sb.append("AttributeKeys: ").append(getAttributeKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveAttributesFromFindingsRequest == false)
            return false;
        RemoveAttributesFromFindingsRequest other = (RemoveAttributesFromFindingsRequest) obj;
        if (other.getFindingArns() == null ^ this.getFindingArns() == null)
            return false;
        if (other.getFindingArns() != null && other.getFindingArns().equals(this.getFindingArns()) == false)
            return false;
        if (other.getAttributeKeys() == null ^ this.getAttributeKeys() == null)
            return false;
        if (other.getAttributeKeys() != null && other.getAttributeKeys().equals(this.getAttributeKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindingArns() == null) ? 0 : getFindingArns().hashCode());
        hashCode = prime * hashCode + ((getAttributeKeys() == null) ? 0 : getAttributeKeys().hashCode());
        return hashCode;
    }

    @Override
    public RemoveAttributesFromFindingsRequest clone() {
        return (RemoveAttributesFromFindingsRequest) super.clone();
    }

}
