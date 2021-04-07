/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configure launced instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/LaunchedInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchedInstance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configure launced instance EC2 ID.
     * </p>
     */
    private String ec2InstanceID;
    /**
     * <p>
     * Configure launced instance first boot.
     * </p>
     */
    private String firstBoot;
    /**
     * <p>
     * Configure launced instance Job ID.
     * </p>
     */
    private String jobID;

    /**
     * <p>
     * Configure launced instance EC2 ID.
     * </p>
     * 
     * @param ec2InstanceID
     *        Configure launced instance EC2 ID.
     */

    public void setEc2InstanceID(String ec2InstanceID) {
        this.ec2InstanceID = ec2InstanceID;
    }

    /**
     * <p>
     * Configure launced instance EC2 ID.
     * </p>
     * 
     * @return Configure launced instance EC2 ID.
     */

    public String getEc2InstanceID() {
        return this.ec2InstanceID;
    }

    /**
     * <p>
     * Configure launced instance EC2 ID.
     * </p>
     * 
     * @param ec2InstanceID
     *        Configure launced instance EC2 ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchedInstance withEc2InstanceID(String ec2InstanceID) {
        setEc2InstanceID(ec2InstanceID);
        return this;
    }

    /**
     * <p>
     * Configure launced instance first boot.
     * </p>
     * 
     * @param firstBoot
     *        Configure launced instance first boot.
     * @see FirstBoot
     */

    public void setFirstBoot(String firstBoot) {
        this.firstBoot = firstBoot;
    }

    /**
     * <p>
     * Configure launced instance first boot.
     * </p>
     * 
     * @return Configure launced instance first boot.
     * @see FirstBoot
     */

    public String getFirstBoot() {
        return this.firstBoot;
    }

    /**
     * <p>
     * Configure launced instance first boot.
     * </p>
     * 
     * @param firstBoot
     *        Configure launced instance first boot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirstBoot
     */

    public LaunchedInstance withFirstBoot(String firstBoot) {
        setFirstBoot(firstBoot);
        return this;
    }

    /**
     * <p>
     * Configure launced instance first boot.
     * </p>
     * 
     * @param firstBoot
     *        Configure launced instance first boot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirstBoot
     */

    public LaunchedInstance withFirstBoot(FirstBoot firstBoot) {
        this.firstBoot = firstBoot.toString();
        return this;
    }

    /**
     * <p>
     * Configure launced instance Job ID.
     * </p>
     * 
     * @param jobID
     *        Configure launced instance Job ID.
     */

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    /**
     * <p>
     * Configure launced instance Job ID.
     * </p>
     * 
     * @return Configure launced instance Job ID.
     */

    public String getJobID() {
        return this.jobID;
    }

    /**
     * <p>
     * Configure launced instance Job ID.
     * </p>
     * 
     * @param jobID
     *        Configure launced instance Job ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchedInstance withJobID(String jobID) {
        setJobID(jobID);
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
        if (getEc2InstanceID() != null)
            sb.append("Ec2InstanceID: ").append(getEc2InstanceID()).append(",");
        if (getFirstBoot() != null)
            sb.append("FirstBoot: ").append(getFirstBoot()).append(",");
        if (getJobID() != null)
            sb.append("JobID: ").append(getJobID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchedInstance == false)
            return false;
        LaunchedInstance other = (LaunchedInstance) obj;
        if (other.getEc2InstanceID() == null ^ this.getEc2InstanceID() == null)
            return false;
        if (other.getEc2InstanceID() != null && other.getEc2InstanceID().equals(this.getEc2InstanceID()) == false)
            return false;
        if (other.getFirstBoot() == null ^ this.getFirstBoot() == null)
            return false;
        if (other.getFirstBoot() != null && other.getFirstBoot().equals(this.getFirstBoot()) == false)
            return false;
        if (other.getJobID() == null ^ this.getJobID() == null)
            return false;
        if (other.getJobID() != null && other.getJobID().equals(this.getJobID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEc2InstanceID() == null) ? 0 : getEc2InstanceID().hashCode());
        hashCode = prime * hashCode + ((getFirstBoot() == null) ? 0 : getFirstBoot().hashCode());
        hashCode = prime * hashCode + ((getJobID() == null) ? 0 : getJobID().hashCode());
        return hashCode;
    }

    @Override
    public LaunchedInstance clone() {
        try {
            return (LaunchedInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.LaunchedInstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
