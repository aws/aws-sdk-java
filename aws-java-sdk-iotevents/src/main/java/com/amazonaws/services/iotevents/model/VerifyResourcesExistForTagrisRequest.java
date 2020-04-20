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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/VerifyResourcesExistForTagris"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifyResourcesExistForTagrisRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private java.util.List<TagrisSweepListItem> tagrisSweepList;

    /**
     * @return
     */

    public java.util.List<TagrisSweepListItem> getTagrisSweepList() {
        return tagrisSweepList;
    }

    /**
     * @param tagrisSweepList
     */

    public void setTagrisSweepList(java.util.Collection<TagrisSweepListItem> tagrisSweepList) {
        if (tagrisSweepList == null) {
            this.tagrisSweepList = null;
            return;
        }

        this.tagrisSweepList = new java.util.ArrayList<TagrisSweepListItem>(tagrisSweepList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagrisSweepList(java.util.Collection)} or {@link #withTagrisSweepList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param tagrisSweepList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyResourcesExistForTagrisRequest withTagrisSweepList(TagrisSweepListItem... tagrisSweepList) {
        if (this.tagrisSweepList == null) {
            setTagrisSweepList(new java.util.ArrayList<TagrisSweepListItem>(tagrisSweepList.length));
        }
        for (TagrisSweepListItem ele : tagrisSweepList) {
            this.tagrisSweepList.add(ele);
        }
        return this;
    }

    /**
     * @param tagrisSweepList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyResourcesExistForTagrisRequest withTagrisSweepList(java.util.Collection<TagrisSweepListItem> tagrisSweepList) {
        setTagrisSweepList(tagrisSweepList);
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
        if (getTagrisSweepList() != null)
            sb.append("TagrisSweepList: ").append(getTagrisSweepList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyResourcesExistForTagrisRequest == false)
            return false;
        VerifyResourcesExistForTagrisRequest other = (VerifyResourcesExistForTagrisRequest) obj;
        if (other.getTagrisSweepList() == null ^ this.getTagrisSweepList() == null)
            return false;
        if (other.getTagrisSweepList() != null && other.getTagrisSweepList().equals(this.getTagrisSweepList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagrisSweepList() == null) ? 0 : getTagrisSweepList().hashCode());
        return hashCode;
    }

    @Override
    public VerifyResourcesExistForTagrisRequest clone() {
        return (VerifyResourcesExistForTagrisRequest) super.clone();
    }

}
