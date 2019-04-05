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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about groups of on-premises instance tags.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/OnPremisesTagSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OnPremisesTagSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list that contains other lists of on-premises instance tag groups. For an instance to be included in the
     * deployment group, it must be identified by all of the tag groups in the list.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<java.util.List<TagFilter>> onPremisesTagSetList;

    /**
     * <p>
     * A list that contains other lists of on-premises instance tag groups. For an instance to be included in the
     * deployment group, it must be identified by all of the tag groups in the list.
     * </p>
     * 
     * @return A list that contains other lists of on-premises instance tag groups. For an instance to be included in
     *         the deployment group, it must be identified by all of the tag groups in the list.
     */

    public java.util.List<java.util.List<TagFilter>> getOnPremisesTagSetList() {
        if (onPremisesTagSetList == null) {
            onPremisesTagSetList = new com.amazonaws.internal.SdkInternalList<java.util.List<TagFilter>>();
        }
        return onPremisesTagSetList;
    }

    /**
     * <p>
     * A list that contains other lists of on-premises instance tag groups. For an instance to be included in the
     * deployment group, it must be identified by all of the tag groups in the list.
     * </p>
     * 
     * @param onPremisesTagSetList
     *        A list that contains other lists of on-premises instance tag groups. For an instance to be included in the
     *        deployment group, it must be identified by all of the tag groups in the list.
     */

    public void setOnPremisesTagSetList(java.util.Collection<java.util.List<TagFilter>> onPremisesTagSetList) {
        if (onPremisesTagSetList == null) {
            this.onPremisesTagSetList = null;
            return;
        }

        this.onPremisesTagSetList = new com.amazonaws.internal.SdkInternalList<java.util.List<TagFilter>>(onPremisesTagSetList);
    }

    /**
     * <p>
     * A list that contains other lists of on-premises instance tag groups. For an instance to be included in the
     * deployment group, it must be identified by all of the tag groups in the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOnPremisesTagSetList(java.util.Collection)} or {@link #withOnPremisesTagSetList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param onPremisesTagSetList
     *        A list that contains other lists of on-premises instance tag groups. For an instance to be included in the
     *        deployment group, it must be identified by all of the tag groups in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnPremisesTagSet withOnPremisesTagSetList(java.util.List<TagFilter>... onPremisesTagSetList) {
        if (this.onPremisesTagSetList == null) {
            setOnPremisesTagSetList(new com.amazonaws.internal.SdkInternalList<java.util.List<TagFilter>>(onPremisesTagSetList.length));
        }
        for (java.util.List<TagFilter> ele : onPremisesTagSetList) {
            this.onPremisesTagSetList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains other lists of on-premises instance tag groups. For an instance to be included in the
     * deployment group, it must be identified by all of the tag groups in the list.
     * </p>
     * 
     * @param onPremisesTagSetList
     *        A list that contains other lists of on-premises instance tag groups. For an instance to be included in the
     *        deployment group, it must be identified by all of the tag groups in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnPremisesTagSet withOnPremisesTagSetList(java.util.Collection<java.util.List<TagFilter>> onPremisesTagSetList) {
        setOnPremisesTagSetList(onPremisesTagSetList);
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
        if (getOnPremisesTagSetList() != null)
            sb.append("OnPremisesTagSetList: ").append(getOnPremisesTagSetList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OnPremisesTagSet == false)
            return false;
        OnPremisesTagSet other = (OnPremisesTagSet) obj;
        if (other.getOnPremisesTagSetList() == null ^ this.getOnPremisesTagSetList() == null)
            return false;
        if (other.getOnPremisesTagSetList() != null && other.getOnPremisesTagSetList().equals(this.getOnPremisesTagSetList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOnPremisesTagSetList() == null) ? 0 : getOnPremisesTagSetList().hashCode());
        return hashCode;
    }

    @Override
    public OnPremisesTagSet clone() {
        try {
            return (OnPremisesTagSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.OnPremisesTagSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
