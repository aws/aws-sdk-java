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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the configuration parameters for an Initiate Glacier Restore job. Amazon S3 batch operations passes each
 * value through to the underlying POST Object restore API. For more information about the parameters for this
 * operation, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPOSTrestore.html#RESTObjectPOSTrestore-restore-request"
 * >Restoring Archives</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/S3InitiateRestoreObjectOperation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3InitiateRestoreObjectOperation implements Serializable, Cloneable {

    /** <p/> */
    private Integer expirationInDays;
    /** <p/> */
    private String glacierJobTier;

    /**
     * <p/>
     * 
     * @param expirationInDays
     */

    public void setExpirationInDays(Integer expirationInDays) {
        this.expirationInDays = expirationInDays;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Integer getExpirationInDays() {
        return this.expirationInDays;
    }

    /**
     * <p/>
     * 
     * @param expirationInDays
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3InitiateRestoreObjectOperation withExpirationInDays(Integer expirationInDays) {
        setExpirationInDays(expirationInDays);
        return this;
    }

    /**
     * <p/>
     * 
     * @param glacierJobTier
     * @see S3GlacierJobTier
     */

    public void setGlacierJobTier(String glacierJobTier) {
        this.glacierJobTier = glacierJobTier;
    }

    /**
     * <p/>
     * 
     * @return
     * @see S3GlacierJobTier
     */

    public String getGlacierJobTier() {
        return this.glacierJobTier;
    }

    /**
     * <p/>
     * 
     * @param glacierJobTier
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3GlacierJobTier
     */

    public S3InitiateRestoreObjectOperation withGlacierJobTier(String glacierJobTier) {
        setGlacierJobTier(glacierJobTier);
        return this;
    }

    /**
     * <p/>
     * 
     * @param glacierJobTier
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3GlacierJobTier
     */

    public S3InitiateRestoreObjectOperation withGlacierJobTier(S3GlacierJobTier glacierJobTier) {
        this.glacierJobTier = glacierJobTier.toString();
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
        if (getExpirationInDays() != null)
            sb.append("ExpirationInDays: ").append(getExpirationInDays()).append(",");
        if (getGlacierJobTier() != null)
            sb.append("GlacierJobTier: ").append(getGlacierJobTier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3InitiateRestoreObjectOperation == false)
            return false;
        S3InitiateRestoreObjectOperation other = (S3InitiateRestoreObjectOperation) obj;
        if (other.getExpirationInDays() == null ^ this.getExpirationInDays() == null)
            return false;
        if (other.getExpirationInDays() != null && other.getExpirationInDays().equals(this.getExpirationInDays()) == false)
            return false;
        if (other.getGlacierJobTier() == null ^ this.getGlacierJobTier() == null)
            return false;
        if (other.getGlacierJobTier() != null && other.getGlacierJobTier().equals(this.getGlacierJobTier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpirationInDays() == null) ? 0 : getExpirationInDays().hashCode());
        hashCode = prime * hashCode + ((getGlacierJobTier() == null) ? 0 : getGlacierJobTier().hashCode());
        return hashCode;
    }

    @Override
    public S3InitiateRestoreObjectOperation clone() {
        try {
            return (S3InitiateRestoreObjectOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
