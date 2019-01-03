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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/UpgradeAppliedSchema"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpgradeAppliedSchemaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the upgraded schema that is returned as part of the response.
     * </p>
     */
    private String upgradedSchemaArn;
    /**
     * <p>
     * The ARN of the directory that is returned as part of the response.
     * </p>
     */
    private String directoryArn;

    /**
     * <p>
     * The ARN of the upgraded schema that is returned as part of the response.
     * </p>
     * 
     * @param upgradedSchemaArn
     *        The ARN of the upgraded schema that is returned as part of the response.
     */

    public void setUpgradedSchemaArn(String upgradedSchemaArn) {
        this.upgradedSchemaArn = upgradedSchemaArn;
    }

    /**
     * <p>
     * The ARN of the upgraded schema that is returned as part of the response.
     * </p>
     * 
     * @return The ARN of the upgraded schema that is returned as part of the response.
     */

    public String getUpgradedSchemaArn() {
        return this.upgradedSchemaArn;
    }

    /**
     * <p>
     * The ARN of the upgraded schema that is returned as part of the response.
     * </p>
     * 
     * @param upgradedSchemaArn
     *        The ARN of the upgraded schema that is returned as part of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeAppliedSchemaResult withUpgradedSchemaArn(String upgradedSchemaArn) {
        setUpgradedSchemaArn(upgradedSchemaArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the directory that is returned as part of the response.
     * </p>
     * 
     * @param directoryArn
     *        The ARN of the directory that is returned as part of the response.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * The ARN of the directory that is returned as part of the response.
     * </p>
     * 
     * @return The ARN of the directory that is returned as part of the response.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * The ARN of the directory that is returned as part of the response.
     * </p>
     * 
     * @param directoryArn
     *        The ARN of the directory that is returned as part of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeAppliedSchemaResult withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
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
        if (getUpgradedSchemaArn() != null)
            sb.append("UpgradedSchemaArn: ").append(getUpgradedSchemaArn()).append(",");
        if (getDirectoryArn() != null)
            sb.append("DirectoryArn: ").append(getDirectoryArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpgradeAppliedSchemaResult == false)
            return false;
        UpgradeAppliedSchemaResult other = (UpgradeAppliedSchemaResult) obj;
        if (other.getUpgradedSchemaArn() == null ^ this.getUpgradedSchemaArn() == null)
            return false;
        if (other.getUpgradedSchemaArn() != null && other.getUpgradedSchemaArn().equals(this.getUpgradedSchemaArn()) == false)
            return false;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpgradedSchemaArn() == null) ? 0 : getUpgradedSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getDirectoryArn() == null) ? 0 : getDirectoryArn().hashCode());
        return hashCode;
    }

    @Override
    public UpgradeAppliedSchemaResult clone() {
        try {
            return (UpgradeAppliedSchemaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
