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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * provides information about the Amazon S3 Public Access Block configuration for accounts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3AccountPublicAccessBlockDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3AccountPublicAccessBlockDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether to reject calls to update an S3 bucket if the calls include a public access control list (ACL).
     * </p>
     */
    private Boolean blockPublicAcls;
    /**
     * <p>
     * Indicates whether to reject calls to update the access policy for an S3 bucket or access point if the policy
     * allows public access.
     * </p>
     */
    private Boolean blockPublicPolicy;
    /**
     * <p>
     * Indicates whether Amazon S3 ignores public ACLs that are associated with an S3 bucket.
     * </p>
     */
    private Boolean ignorePublicAcls;
    /**
     * <p>
     * Indicates whether to restrict access to an access point or S3 bucket that has a public policy to only AWS service
     * principals and authorized users within the S3 bucket owner's account.
     * </p>
     */
    private Boolean restrictPublicBuckets;

    /**
     * <p>
     * Indicates whether to reject calls to update an S3 bucket if the calls include a public access control list (ACL).
     * </p>
     * 
     * @param blockPublicAcls
     *        Indicates whether to reject calls to update an S3 bucket if the calls include a public access control list
     *        (ACL).
     */

    public void setBlockPublicAcls(Boolean blockPublicAcls) {
        this.blockPublicAcls = blockPublicAcls;
    }

    /**
     * <p>
     * Indicates whether to reject calls to update an S3 bucket if the calls include a public access control list (ACL).
     * </p>
     * 
     * @return Indicates whether to reject calls to update an S3 bucket if the calls include a public access control
     *         list (ACL).
     */

    public Boolean getBlockPublicAcls() {
        return this.blockPublicAcls;
    }

    /**
     * <p>
     * Indicates whether to reject calls to update an S3 bucket if the calls include a public access control list (ACL).
     * </p>
     * 
     * @param blockPublicAcls
     *        Indicates whether to reject calls to update an S3 bucket if the calls include a public access control list
     *        (ACL).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3AccountPublicAccessBlockDetails withBlockPublicAcls(Boolean blockPublicAcls) {
        setBlockPublicAcls(blockPublicAcls);
        return this;
    }

    /**
     * <p>
     * Indicates whether to reject calls to update an S3 bucket if the calls include a public access control list (ACL).
     * </p>
     * 
     * @return Indicates whether to reject calls to update an S3 bucket if the calls include a public access control
     *         list (ACL).
     */

    public Boolean isBlockPublicAcls() {
        return this.blockPublicAcls;
    }

    /**
     * <p>
     * Indicates whether to reject calls to update the access policy for an S3 bucket or access point if the policy
     * allows public access.
     * </p>
     * 
     * @param blockPublicPolicy
     *        Indicates whether to reject calls to update the access policy for an S3 bucket or access point if the
     *        policy allows public access.
     */

    public void setBlockPublicPolicy(Boolean blockPublicPolicy) {
        this.blockPublicPolicy = blockPublicPolicy;
    }

    /**
     * <p>
     * Indicates whether to reject calls to update the access policy for an S3 bucket or access point if the policy
     * allows public access.
     * </p>
     * 
     * @return Indicates whether to reject calls to update the access policy for an S3 bucket or access point if the
     *         policy allows public access.
     */

    public Boolean getBlockPublicPolicy() {
        return this.blockPublicPolicy;
    }

    /**
     * <p>
     * Indicates whether to reject calls to update the access policy for an S3 bucket or access point if the policy
     * allows public access.
     * </p>
     * 
     * @param blockPublicPolicy
     *        Indicates whether to reject calls to update the access policy for an S3 bucket or access point if the
     *        policy allows public access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3AccountPublicAccessBlockDetails withBlockPublicPolicy(Boolean blockPublicPolicy) {
        setBlockPublicPolicy(blockPublicPolicy);
        return this;
    }

    /**
     * <p>
     * Indicates whether to reject calls to update the access policy for an S3 bucket or access point if the policy
     * allows public access.
     * </p>
     * 
     * @return Indicates whether to reject calls to update the access policy for an S3 bucket or access point if the
     *         policy allows public access.
     */

    public Boolean isBlockPublicPolicy() {
        return this.blockPublicPolicy;
    }

    /**
     * <p>
     * Indicates whether Amazon S3 ignores public ACLs that are associated with an S3 bucket.
     * </p>
     * 
     * @param ignorePublicAcls
     *        Indicates whether Amazon S3 ignores public ACLs that are associated with an S3 bucket.
     */

    public void setIgnorePublicAcls(Boolean ignorePublicAcls) {
        this.ignorePublicAcls = ignorePublicAcls;
    }

    /**
     * <p>
     * Indicates whether Amazon S3 ignores public ACLs that are associated with an S3 bucket.
     * </p>
     * 
     * @return Indicates whether Amazon S3 ignores public ACLs that are associated with an S3 bucket.
     */

    public Boolean getIgnorePublicAcls() {
        return this.ignorePublicAcls;
    }

    /**
     * <p>
     * Indicates whether Amazon S3 ignores public ACLs that are associated with an S3 bucket.
     * </p>
     * 
     * @param ignorePublicAcls
     *        Indicates whether Amazon S3 ignores public ACLs that are associated with an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3AccountPublicAccessBlockDetails withIgnorePublicAcls(Boolean ignorePublicAcls) {
        setIgnorePublicAcls(ignorePublicAcls);
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon S3 ignores public ACLs that are associated with an S3 bucket.
     * </p>
     * 
     * @return Indicates whether Amazon S3 ignores public ACLs that are associated with an S3 bucket.
     */

    public Boolean isIgnorePublicAcls() {
        return this.ignorePublicAcls;
    }

    /**
     * <p>
     * Indicates whether to restrict access to an access point or S3 bucket that has a public policy to only AWS service
     * principals and authorized users within the S3 bucket owner's account.
     * </p>
     * 
     * @param restrictPublicBuckets
     *        Indicates whether to restrict access to an access point or S3 bucket that has a public policy to only AWS
     *        service principals and authorized users within the S3 bucket owner's account.
     */

    public void setRestrictPublicBuckets(Boolean restrictPublicBuckets) {
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    /**
     * <p>
     * Indicates whether to restrict access to an access point or S3 bucket that has a public policy to only AWS service
     * principals and authorized users within the S3 bucket owner's account.
     * </p>
     * 
     * @return Indicates whether to restrict access to an access point or S3 bucket that has a public policy to only AWS
     *         service principals and authorized users within the S3 bucket owner's account.
     */

    public Boolean getRestrictPublicBuckets() {
        return this.restrictPublicBuckets;
    }

    /**
     * <p>
     * Indicates whether to restrict access to an access point or S3 bucket that has a public policy to only AWS service
     * principals and authorized users within the S3 bucket owner's account.
     * </p>
     * 
     * @param restrictPublicBuckets
     *        Indicates whether to restrict access to an access point or S3 bucket that has a public policy to only AWS
     *        service principals and authorized users within the S3 bucket owner's account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3AccountPublicAccessBlockDetails withRestrictPublicBuckets(Boolean restrictPublicBuckets) {
        setRestrictPublicBuckets(restrictPublicBuckets);
        return this;
    }

    /**
     * <p>
     * Indicates whether to restrict access to an access point or S3 bucket that has a public policy to only AWS service
     * principals and authorized users within the S3 bucket owner's account.
     * </p>
     * 
     * @return Indicates whether to restrict access to an access point or S3 bucket that has a public policy to only AWS
     *         service principals and authorized users within the S3 bucket owner's account.
     */

    public Boolean isRestrictPublicBuckets() {
        return this.restrictPublicBuckets;
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
        if (getBlockPublicAcls() != null)
            sb.append("BlockPublicAcls: ").append(getBlockPublicAcls()).append(",");
        if (getBlockPublicPolicy() != null)
            sb.append("BlockPublicPolicy: ").append(getBlockPublicPolicy()).append(",");
        if (getIgnorePublicAcls() != null)
            sb.append("IgnorePublicAcls: ").append(getIgnorePublicAcls()).append(",");
        if (getRestrictPublicBuckets() != null)
            sb.append("RestrictPublicBuckets: ").append(getRestrictPublicBuckets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3AccountPublicAccessBlockDetails == false)
            return false;
        AwsS3AccountPublicAccessBlockDetails other = (AwsS3AccountPublicAccessBlockDetails) obj;
        if (other.getBlockPublicAcls() == null ^ this.getBlockPublicAcls() == null)
            return false;
        if (other.getBlockPublicAcls() != null && other.getBlockPublicAcls().equals(this.getBlockPublicAcls()) == false)
            return false;
        if (other.getBlockPublicPolicy() == null ^ this.getBlockPublicPolicy() == null)
            return false;
        if (other.getBlockPublicPolicy() != null && other.getBlockPublicPolicy().equals(this.getBlockPublicPolicy()) == false)
            return false;
        if (other.getIgnorePublicAcls() == null ^ this.getIgnorePublicAcls() == null)
            return false;
        if (other.getIgnorePublicAcls() != null && other.getIgnorePublicAcls().equals(this.getIgnorePublicAcls()) == false)
            return false;
        if (other.getRestrictPublicBuckets() == null ^ this.getRestrictPublicBuckets() == null)
            return false;
        if (other.getRestrictPublicBuckets() != null && other.getRestrictPublicBuckets().equals(this.getRestrictPublicBuckets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlockPublicAcls() == null) ? 0 : getBlockPublicAcls().hashCode());
        hashCode = prime * hashCode + ((getBlockPublicPolicy() == null) ? 0 : getBlockPublicPolicy().hashCode());
        hashCode = prime * hashCode + ((getIgnorePublicAcls() == null) ? 0 : getIgnorePublicAcls().hashCode());
        hashCode = prime * hashCode + ((getRestrictPublicBuckets() == null) ? 0 : getRestrictPublicBuckets().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3AccountPublicAccessBlockDetails clone() {
        try {
            return (AwsS3AccountPublicAccessBlockDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3AccountPublicAccessBlockDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
