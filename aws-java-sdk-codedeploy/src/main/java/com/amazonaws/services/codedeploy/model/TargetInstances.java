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
 * Information about the instances to be used in the replacement environment in a blue/green deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/TargetInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetInstances implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The tag filter key, type, and value used to identify Amazon EC2 instances in a replacement environment for a
     * blue/green deployment. Cannot be used in the same call as ec2TagSet.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EC2TagFilter> tagFilters;
    /**
     * <p>
     * The names of one or more Auto Scaling groups to identify a replacement environment for a blue/green deployment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> autoScalingGroups;
    /**
     * <p>
     * Information about the groups of EC2 instance tags that an instance must be identified by in order for it to be
     * included in the replacement environment for a blue/green deployment. Cannot be used in the same call as
     * tagFilters.
     * </p>
     */
    private EC2TagSet ec2TagSet;

    /**
     * <p>
     * The tag filter key, type, and value used to identify Amazon EC2 instances in a replacement environment for a
     * blue/green deployment. Cannot be used in the same call as ec2TagSet.
     * </p>
     * 
     * @return The tag filter key, type, and value used to identify Amazon EC2 instances in a replacement environment
     *         for a blue/green deployment. Cannot be used in the same call as ec2TagSet.
     */

    public java.util.List<EC2TagFilter> getTagFilters() {
        if (tagFilters == null) {
            tagFilters = new com.amazonaws.internal.SdkInternalList<EC2TagFilter>();
        }
        return tagFilters;
    }

    /**
     * <p>
     * The tag filter key, type, and value used to identify Amazon EC2 instances in a replacement environment for a
     * blue/green deployment. Cannot be used in the same call as ec2TagSet.
     * </p>
     * 
     * @param tagFilters
     *        The tag filter key, type, and value used to identify Amazon EC2 instances in a replacement environment for
     *        a blue/green deployment. Cannot be used in the same call as ec2TagSet.
     */

    public void setTagFilters(java.util.Collection<EC2TagFilter> tagFilters) {
        if (tagFilters == null) {
            this.tagFilters = null;
            return;
        }

        this.tagFilters = new com.amazonaws.internal.SdkInternalList<EC2TagFilter>(tagFilters);
    }

    /**
     * <p>
     * The tag filter key, type, and value used to identify Amazon EC2 instances in a replacement environment for a
     * blue/green deployment. Cannot be used in the same call as ec2TagSet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagFilters(java.util.Collection)} or {@link #withTagFilters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagFilters
     *        The tag filter key, type, and value used to identify Amazon EC2 instances in a replacement environment for
     *        a blue/green deployment. Cannot be used in the same call as ec2TagSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetInstances withTagFilters(EC2TagFilter... tagFilters) {
        if (this.tagFilters == null) {
            setTagFilters(new com.amazonaws.internal.SdkInternalList<EC2TagFilter>(tagFilters.length));
        }
        for (EC2TagFilter ele : tagFilters) {
            this.tagFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag filter key, type, and value used to identify Amazon EC2 instances in a replacement environment for a
     * blue/green deployment. Cannot be used in the same call as ec2TagSet.
     * </p>
     * 
     * @param tagFilters
     *        The tag filter key, type, and value used to identify Amazon EC2 instances in a replacement environment for
     *        a blue/green deployment. Cannot be used in the same call as ec2TagSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetInstances withTagFilters(java.util.Collection<EC2TagFilter> tagFilters) {
        setTagFilters(tagFilters);
        return this;
    }

    /**
     * <p>
     * The names of one or more Auto Scaling groups to identify a replacement environment for a blue/green deployment.
     * </p>
     * 
     * @return The names of one or more Auto Scaling groups to identify a replacement environment for a blue/green
     *         deployment.
     */

    public java.util.List<String> getAutoScalingGroups() {
        if (autoScalingGroups == null) {
            autoScalingGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return autoScalingGroups;
    }

    /**
     * <p>
     * The names of one or more Auto Scaling groups to identify a replacement environment for a blue/green deployment.
     * </p>
     * 
     * @param autoScalingGroups
     *        The names of one or more Auto Scaling groups to identify a replacement environment for a blue/green
     *        deployment.
     */

    public void setAutoScalingGroups(java.util.Collection<String> autoScalingGroups) {
        if (autoScalingGroups == null) {
            this.autoScalingGroups = null;
            return;
        }

        this.autoScalingGroups = new com.amazonaws.internal.SdkInternalList<String>(autoScalingGroups);
    }

    /**
     * <p>
     * The names of one or more Auto Scaling groups to identify a replacement environment for a blue/green deployment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoScalingGroups(java.util.Collection)} or {@link #withAutoScalingGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param autoScalingGroups
     *        The names of one or more Auto Scaling groups to identify a replacement environment for a blue/green
     *        deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetInstances withAutoScalingGroups(String... autoScalingGroups) {
        if (this.autoScalingGroups == null) {
            setAutoScalingGroups(new com.amazonaws.internal.SdkInternalList<String>(autoScalingGroups.length));
        }
        for (String ele : autoScalingGroups) {
            this.autoScalingGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of one or more Auto Scaling groups to identify a replacement environment for a blue/green deployment.
     * </p>
     * 
     * @param autoScalingGroups
     *        The names of one or more Auto Scaling groups to identify a replacement environment for a blue/green
     *        deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetInstances withAutoScalingGroups(java.util.Collection<String> autoScalingGroups) {
        setAutoScalingGroups(autoScalingGroups);
        return this;
    }

    /**
     * <p>
     * Information about the groups of EC2 instance tags that an instance must be identified by in order for it to be
     * included in the replacement environment for a blue/green deployment. Cannot be used in the same call as
     * tagFilters.
     * </p>
     * 
     * @param ec2TagSet
     *        Information about the groups of EC2 instance tags that an instance must be identified by in order for it
     *        to be included in the replacement environment for a blue/green deployment. Cannot be used in the same call
     *        as tagFilters.
     */

    public void setEc2TagSet(EC2TagSet ec2TagSet) {
        this.ec2TagSet = ec2TagSet;
    }

    /**
     * <p>
     * Information about the groups of EC2 instance tags that an instance must be identified by in order for it to be
     * included in the replacement environment for a blue/green deployment. Cannot be used in the same call as
     * tagFilters.
     * </p>
     * 
     * @return Information about the groups of EC2 instance tags that an instance must be identified by in order for it
     *         to be included in the replacement environment for a blue/green deployment. Cannot be used in the same
     *         call as tagFilters.
     */

    public EC2TagSet getEc2TagSet() {
        return this.ec2TagSet;
    }

    /**
     * <p>
     * Information about the groups of EC2 instance tags that an instance must be identified by in order for it to be
     * included in the replacement environment for a blue/green deployment. Cannot be used in the same call as
     * tagFilters.
     * </p>
     * 
     * @param ec2TagSet
     *        Information about the groups of EC2 instance tags that an instance must be identified by in order for it
     *        to be included in the replacement environment for a blue/green deployment. Cannot be used in the same call
     *        as tagFilters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetInstances withEc2TagSet(EC2TagSet ec2TagSet) {
        setEc2TagSet(ec2TagSet);
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
        if (getTagFilters() != null)
            sb.append("TagFilters: ").append(getTagFilters()).append(",");
        if (getAutoScalingGroups() != null)
            sb.append("AutoScalingGroups: ").append(getAutoScalingGroups()).append(",");
        if (getEc2TagSet() != null)
            sb.append("Ec2TagSet: ").append(getEc2TagSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetInstances == false)
            return false;
        TargetInstances other = (TargetInstances) obj;
        if (other.getTagFilters() == null ^ this.getTagFilters() == null)
            return false;
        if (other.getTagFilters() != null && other.getTagFilters().equals(this.getTagFilters()) == false)
            return false;
        if (other.getAutoScalingGroups() == null ^ this.getAutoScalingGroups() == null)
            return false;
        if (other.getAutoScalingGroups() != null && other.getAutoScalingGroups().equals(this.getAutoScalingGroups()) == false)
            return false;
        if (other.getEc2TagSet() == null ^ this.getEc2TagSet() == null)
            return false;
        if (other.getEc2TagSet() != null && other.getEc2TagSet().equals(this.getEc2TagSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagFilters() == null) ? 0 : getTagFilters().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroups() == null) ? 0 : getAutoScalingGroups().hashCode());
        hashCode = prime * hashCode + ((getEc2TagSet() == null) ? 0 : getEc2TagSet().hashCode());
        return hashCode;
    }

    @Override
    public TargetInstances clone() {
        try {
            return (TargetInstances) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.TargetInstancesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
