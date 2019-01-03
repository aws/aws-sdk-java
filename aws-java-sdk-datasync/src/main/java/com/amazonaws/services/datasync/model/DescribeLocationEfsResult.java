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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * DescribeLocationEfsResponse
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationEfs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLocationEfsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon resource Name (ARN) of the EFS location that was described.
     * </p>
     */
    private String locationArn;
    /**
     * <p>
     * The URL of the EFS location that was described.
     * </p>
     */
    private String locationUri;

    private Ec2Config ec2Config;
    /**
     * <p>
     * The time that the EFS location was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The Amazon resource Name (ARN) of the EFS location that was described.
     * </p>
     * 
     * @param locationArn
     *        The Amazon resource Name (ARN) of the EFS location that was described.
     */

    public void setLocationArn(String locationArn) {
        this.locationArn = locationArn;
    }

    /**
     * <p>
     * The Amazon resource Name (ARN) of the EFS location that was described.
     * </p>
     * 
     * @return The Amazon resource Name (ARN) of the EFS location that was described.
     */

    public String getLocationArn() {
        return this.locationArn;
    }

    /**
     * <p>
     * The Amazon resource Name (ARN) of the EFS location that was described.
     * </p>
     * 
     * @param locationArn
     *        The Amazon resource Name (ARN) of the EFS location that was described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationEfsResult withLocationArn(String locationArn) {
        setLocationArn(locationArn);
        return this;
    }

    /**
     * <p>
     * The URL of the EFS location that was described.
     * </p>
     * 
     * @param locationUri
     *        The URL of the EFS location that was described.
     */

    public void setLocationUri(String locationUri) {
        this.locationUri = locationUri;
    }

    /**
     * <p>
     * The URL of the EFS location that was described.
     * </p>
     * 
     * @return The URL of the EFS location that was described.
     */

    public String getLocationUri() {
        return this.locationUri;
    }

    /**
     * <p>
     * The URL of the EFS location that was described.
     * </p>
     * 
     * @param locationUri
     *        The URL of the EFS location that was described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationEfsResult withLocationUri(String locationUri) {
        setLocationUri(locationUri);
        return this;
    }

    /**
     * @param ec2Config
     */

    public void setEc2Config(Ec2Config ec2Config) {
        this.ec2Config = ec2Config;
    }

    /**
     * @return
     */

    public Ec2Config getEc2Config() {
        return this.ec2Config;
    }

    /**
     * @param ec2Config
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationEfsResult withEc2Config(Ec2Config ec2Config) {
        setEc2Config(ec2Config);
        return this;
    }

    /**
     * <p>
     * The time that the EFS location was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the EFS location was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the EFS location was created.
     * </p>
     * 
     * @return The time that the EFS location was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the EFS location was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the EFS location was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationEfsResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getLocationArn() != null)
            sb.append("LocationArn: ").append(getLocationArn()).append(",");
        if (getLocationUri() != null)
            sb.append("LocationUri: ").append(getLocationUri()).append(",");
        if (getEc2Config() != null)
            sb.append("Ec2Config: ").append(getEc2Config()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLocationEfsResult == false)
            return false;
        DescribeLocationEfsResult other = (DescribeLocationEfsResult) obj;
        if (other.getLocationArn() == null ^ this.getLocationArn() == null)
            return false;
        if (other.getLocationArn() != null && other.getLocationArn().equals(this.getLocationArn()) == false)
            return false;
        if (other.getLocationUri() == null ^ this.getLocationUri() == null)
            return false;
        if (other.getLocationUri() != null && other.getLocationUri().equals(this.getLocationUri()) == false)
            return false;
        if (other.getEc2Config() == null ^ this.getEc2Config() == null)
            return false;
        if (other.getEc2Config() != null && other.getEc2Config().equals(this.getEc2Config()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationArn() == null) ? 0 : getLocationArn().hashCode());
        hashCode = prime * hashCode + ((getLocationUri() == null) ? 0 : getLocationUri().hashCode());
        hashCode = prime * hashCode + ((getEc2Config() == null) ? 0 : getEc2Config().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLocationEfsResult clone() {
        try {
            return (DescribeLocationEfsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
