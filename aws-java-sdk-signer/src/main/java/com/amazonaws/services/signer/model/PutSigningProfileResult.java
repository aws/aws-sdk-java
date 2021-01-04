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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/PutSigningProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSigningProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signing profile created.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The version of the signing profile being created.
     * </p>
     */
    private String profileVersion;
    /**
     * <p>
     * The signing profile ARN, including the profile version.
     * </p>
     */
    private String profileVersionArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signing profile created.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the signing profile created.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signing profile created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the signing profile created.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signing profile created.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the signing profile created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSigningProfileResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The version of the signing profile being created.
     * </p>
     * 
     * @param profileVersion
     *        The version of the signing profile being created.
     */

    public void setProfileVersion(String profileVersion) {
        this.profileVersion = profileVersion;
    }

    /**
     * <p>
     * The version of the signing profile being created.
     * </p>
     * 
     * @return The version of the signing profile being created.
     */

    public String getProfileVersion() {
        return this.profileVersion;
    }

    /**
     * <p>
     * The version of the signing profile being created.
     * </p>
     * 
     * @param profileVersion
     *        The version of the signing profile being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSigningProfileResult withProfileVersion(String profileVersion) {
        setProfileVersion(profileVersion);
        return this;
    }

    /**
     * <p>
     * The signing profile ARN, including the profile version.
     * </p>
     * 
     * @param profileVersionArn
     *        The signing profile ARN, including the profile version.
     */

    public void setProfileVersionArn(String profileVersionArn) {
        this.profileVersionArn = profileVersionArn;
    }

    /**
     * <p>
     * The signing profile ARN, including the profile version.
     * </p>
     * 
     * @return The signing profile ARN, including the profile version.
     */

    public String getProfileVersionArn() {
        return this.profileVersionArn;
    }

    /**
     * <p>
     * The signing profile ARN, including the profile version.
     * </p>
     * 
     * @param profileVersionArn
     *        The signing profile ARN, including the profile version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSigningProfileResult withProfileVersionArn(String profileVersionArn) {
        setProfileVersionArn(profileVersionArn);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getProfileVersion() != null)
            sb.append("ProfileVersion: ").append(getProfileVersion()).append(",");
        if (getProfileVersionArn() != null)
            sb.append("ProfileVersionArn: ").append(getProfileVersionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSigningProfileResult == false)
            return false;
        PutSigningProfileResult other = (PutSigningProfileResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getProfileVersion() == null ^ this.getProfileVersion() == null)
            return false;
        if (other.getProfileVersion() != null && other.getProfileVersion().equals(this.getProfileVersion()) == false)
            return false;
        if (other.getProfileVersionArn() == null ^ this.getProfileVersionArn() == null)
            return false;
        if (other.getProfileVersionArn() != null && other.getProfileVersionArn().equals(this.getProfileVersionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getProfileVersion() == null) ? 0 : getProfileVersion().hashCode());
        hashCode = prime * hashCode + ((getProfileVersionArn() == null) ? 0 : getProfileVersionArn().hashCode());
        return hashCode;
    }

    @Override
    public PutSigningProfileResult clone() {
        try {
            return (PutSigningProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
