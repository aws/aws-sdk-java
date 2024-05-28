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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the scope of the notifications such as the affected resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ScopeDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScopeDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Underlying LF resources that will be affected by this notification.
     * </p>
     */
    private java.util.List<LakeFormationTagPolicyDetails> lakeFormationTagPolicies;
    /**
     * <p>
     * Underlying Redshift resources that will be affected by this notification.
     * </p>
     */
    private java.util.List<RedshiftDataShareDetails> redshiftDataShares;
    /**
     * <p>
     * Underlying S3 resources that will be affected by this notification.
     * </p>
     */
    private java.util.List<S3DataAccessDetails> s3DataAccesses;

    /**
     * <p>
     * Underlying LF resources that will be affected by this notification.
     * </p>
     * 
     * @return Underlying LF resources that will be affected by this notification.
     */

    public java.util.List<LakeFormationTagPolicyDetails> getLakeFormationTagPolicies() {
        return lakeFormationTagPolicies;
    }

    /**
     * <p>
     * Underlying LF resources that will be affected by this notification.
     * </p>
     * 
     * @param lakeFormationTagPolicies
     *        Underlying LF resources that will be affected by this notification.
     */

    public void setLakeFormationTagPolicies(java.util.Collection<LakeFormationTagPolicyDetails> lakeFormationTagPolicies) {
        if (lakeFormationTagPolicies == null) {
            this.lakeFormationTagPolicies = null;
            return;
        }

        this.lakeFormationTagPolicies = new java.util.ArrayList<LakeFormationTagPolicyDetails>(lakeFormationTagPolicies);
    }

    /**
     * <p>
     * Underlying LF resources that will be affected by this notification.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLakeFormationTagPolicies(java.util.Collection)} or
     * {@link #withLakeFormationTagPolicies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param lakeFormationTagPolicies
     *        Underlying LF resources that will be affected by this notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScopeDetails withLakeFormationTagPolicies(LakeFormationTagPolicyDetails... lakeFormationTagPolicies) {
        if (this.lakeFormationTagPolicies == null) {
            setLakeFormationTagPolicies(new java.util.ArrayList<LakeFormationTagPolicyDetails>(lakeFormationTagPolicies.length));
        }
        for (LakeFormationTagPolicyDetails ele : lakeFormationTagPolicies) {
            this.lakeFormationTagPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Underlying LF resources that will be affected by this notification.
     * </p>
     * 
     * @param lakeFormationTagPolicies
     *        Underlying LF resources that will be affected by this notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScopeDetails withLakeFormationTagPolicies(java.util.Collection<LakeFormationTagPolicyDetails> lakeFormationTagPolicies) {
        setLakeFormationTagPolicies(lakeFormationTagPolicies);
        return this;
    }

    /**
     * <p>
     * Underlying Redshift resources that will be affected by this notification.
     * </p>
     * 
     * @return Underlying Redshift resources that will be affected by this notification.
     */

    public java.util.List<RedshiftDataShareDetails> getRedshiftDataShares() {
        return redshiftDataShares;
    }

    /**
     * <p>
     * Underlying Redshift resources that will be affected by this notification.
     * </p>
     * 
     * @param redshiftDataShares
     *        Underlying Redshift resources that will be affected by this notification.
     */

    public void setRedshiftDataShares(java.util.Collection<RedshiftDataShareDetails> redshiftDataShares) {
        if (redshiftDataShares == null) {
            this.redshiftDataShares = null;
            return;
        }

        this.redshiftDataShares = new java.util.ArrayList<RedshiftDataShareDetails>(redshiftDataShares);
    }

    /**
     * <p>
     * Underlying Redshift resources that will be affected by this notification.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRedshiftDataShares(java.util.Collection)} or {@link #withRedshiftDataShares(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param redshiftDataShares
     *        Underlying Redshift resources that will be affected by this notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScopeDetails withRedshiftDataShares(RedshiftDataShareDetails... redshiftDataShares) {
        if (this.redshiftDataShares == null) {
            setRedshiftDataShares(new java.util.ArrayList<RedshiftDataShareDetails>(redshiftDataShares.length));
        }
        for (RedshiftDataShareDetails ele : redshiftDataShares) {
            this.redshiftDataShares.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Underlying Redshift resources that will be affected by this notification.
     * </p>
     * 
     * @param redshiftDataShares
     *        Underlying Redshift resources that will be affected by this notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScopeDetails withRedshiftDataShares(java.util.Collection<RedshiftDataShareDetails> redshiftDataShares) {
        setRedshiftDataShares(redshiftDataShares);
        return this;
    }

    /**
     * <p>
     * Underlying S3 resources that will be affected by this notification.
     * </p>
     * 
     * @return Underlying S3 resources that will be affected by this notification.
     */

    public java.util.List<S3DataAccessDetails> getS3DataAccesses() {
        return s3DataAccesses;
    }

    /**
     * <p>
     * Underlying S3 resources that will be affected by this notification.
     * </p>
     * 
     * @param s3DataAccesses
     *        Underlying S3 resources that will be affected by this notification.
     */

    public void setS3DataAccesses(java.util.Collection<S3DataAccessDetails> s3DataAccesses) {
        if (s3DataAccesses == null) {
            this.s3DataAccesses = null;
            return;
        }

        this.s3DataAccesses = new java.util.ArrayList<S3DataAccessDetails>(s3DataAccesses);
    }

    /**
     * <p>
     * Underlying S3 resources that will be affected by this notification.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setS3DataAccesses(java.util.Collection)} or {@link #withS3DataAccesses(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param s3DataAccesses
     *        Underlying S3 resources that will be affected by this notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScopeDetails withS3DataAccesses(S3DataAccessDetails... s3DataAccesses) {
        if (this.s3DataAccesses == null) {
            setS3DataAccesses(new java.util.ArrayList<S3DataAccessDetails>(s3DataAccesses.length));
        }
        for (S3DataAccessDetails ele : s3DataAccesses) {
            this.s3DataAccesses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Underlying S3 resources that will be affected by this notification.
     * </p>
     * 
     * @param s3DataAccesses
     *        Underlying S3 resources that will be affected by this notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScopeDetails withS3DataAccesses(java.util.Collection<S3DataAccessDetails> s3DataAccesses) {
        setS3DataAccesses(s3DataAccesses);
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
        if (getLakeFormationTagPolicies() != null)
            sb.append("LakeFormationTagPolicies: ").append(getLakeFormationTagPolicies()).append(",");
        if (getRedshiftDataShares() != null)
            sb.append("RedshiftDataShares: ").append(getRedshiftDataShares()).append(",");
        if (getS3DataAccesses() != null)
            sb.append("S3DataAccesses: ").append(getS3DataAccesses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScopeDetails == false)
            return false;
        ScopeDetails other = (ScopeDetails) obj;
        if (other.getLakeFormationTagPolicies() == null ^ this.getLakeFormationTagPolicies() == null)
            return false;
        if (other.getLakeFormationTagPolicies() != null && other.getLakeFormationTagPolicies().equals(this.getLakeFormationTagPolicies()) == false)
            return false;
        if (other.getRedshiftDataShares() == null ^ this.getRedshiftDataShares() == null)
            return false;
        if (other.getRedshiftDataShares() != null && other.getRedshiftDataShares().equals(this.getRedshiftDataShares()) == false)
            return false;
        if (other.getS3DataAccesses() == null ^ this.getS3DataAccesses() == null)
            return false;
        if (other.getS3DataAccesses() != null && other.getS3DataAccesses().equals(this.getS3DataAccesses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLakeFormationTagPolicies() == null) ? 0 : getLakeFormationTagPolicies().hashCode());
        hashCode = prime * hashCode + ((getRedshiftDataShares() == null) ? 0 : getRedshiftDataShares().hashCode());
        hashCode = prime * hashCode + ((getS3DataAccesses() == null) ? 0 : getS3DataAccesses().hashCode());
        return hashCode;
    }

    @Override
    public ScopeDetails clone() {
        try {
            return (ScopeDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.ScopeDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
