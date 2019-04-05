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
 * Information about groups of EC2 instance tags.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/EC2TagSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2TagSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list that contains other lists of EC2 instance tag groups. For an instance to be included in the deployment
     * group, it must be identified by all of the tag groups in the list.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<java.util.List<EC2TagFilter>> ec2TagSetList;

    /**
     * <p>
     * A list that contains other lists of EC2 instance tag groups. For an instance to be included in the deployment
     * group, it must be identified by all of the tag groups in the list.
     * </p>
     * 
     * @return A list that contains other lists of EC2 instance tag groups. For an instance to be included in the
     *         deployment group, it must be identified by all of the tag groups in the list.
     */

    public java.util.List<java.util.List<EC2TagFilter>> getEc2TagSetList() {
        if (ec2TagSetList == null) {
            ec2TagSetList = new com.amazonaws.internal.SdkInternalList<java.util.List<EC2TagFilter>>();
        }
        return ec2TagSetList;
    }

    /**
     * <p>
     * A list that contains other lists of EC2 instance tag groups. For an instance to be included in the deployment
     * group, it must be identified by all of the tag groups in the list.
     * </p>
     * 
     * @param ec2TagSetList
     *        A list that contains other lists of EC2 instance tag groups. For an instance to be included in the
     *        deployment group, it must be identified by all of the tag groups in the list.
     */

    public void setEc2TagSetList(java.util.Collection<java.util.List<EC2TagFilter>> ec2TagSetList) {
        if (ec2TagSetList == null) {
            this.ec2TagSetList = null;
            return;
        }

        this.ec2TagSetList = new com.amazonaws.internal.SdkInternalList<java.util.List<EC2TagFilter>>(ec2TagSetList);
    }

    /**
     * <p>
     * A list that contains other lists of EC2 instance tag groups. For an instance to be included in the deployment
     * group, it must be identified by all of the tag groups in the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEc2TagSetList(java.util.Collection)} or {@link #withEc2TagSetList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ec2TagSetList
     *        A list that contains other lists of EC2 instance tag groups. For an instance to be included in the
     *        deployment group, it must be identified by all of the tag groups in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2TagSet withEc2TagSetList(java.util.List<EC2TagFilter>... ec2TagSetList) {
        if (this.ec2TagSetList == null) {
            setEc2TagSetList(new com.amazonaws.internal.SdkInternalList<java.util.List<EC2TagFilter>>(ec2TagSetList.length));
        }
        for (java.util.List<EC2TagFilter> ele : ec2TagSetList) {
            this.ec2TagSetList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains other lists of EC2 instance tag groups. For an instance to be included in the deployment
     * group, it must be identified by all of the tag groups in the list.
     * </p>
     * 
     * @param ec2TagSetList
     *        A list that contains other lists of EC2 instance tag groups. For an instance to be included in the
     *        deployment group, it must be identified by all of the tag groups in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2TagSet withEc2TagSetList(java.util.Collection<java.util.List<EC2TagFilter>> ec2TagSetList) {
        setEc2TagSetList(ec2TagSetList);
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
        if (getEc2TagSetList() != null)
            sb.append("Ec2TagSetList: ").append(getEc2TagSetList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EC2TagSet == false)
            return false;
        EC2TagSet other = (EC2TagSet) obj;
        if (other.getEc2TagSetList() == null ^ this.getEc2TagSetList() == null)
            return false;
        if (other.getEc2TagSetList() != null && other.getEc2TagSetList().equals(this.getEc2TagSetList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEc2TagSetList() == null) ? 0 : getEc2TagSetList().hashCode());
        return hashCode;
    }

    @Override
    public EC2TagSet clone() {
        try {
            return (EC2TagSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.EC2TagSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
