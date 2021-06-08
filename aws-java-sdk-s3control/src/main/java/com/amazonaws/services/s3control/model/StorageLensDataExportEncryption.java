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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A container for the encryption of the S3 Storage Lens metrics exports.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/StorageLensDataExportEncryption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageLensDataExportEncryption implements Serializable, Cloneable {

    /** <p/> */
    private SSES3 sSES3;
    /** <p/> */
    private SSEKMS sSEKMS;

    /**
     * <p/>
     * 
     * @param sSES3
     */

    public void setSSES3(SSES3 sSES3) {
        this.sSES3 = sSES3;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public SSES3 getSSES3() {
        return this.sSES3;
    }

    /**
     * <p/>
     * 
     * @param sSES3
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensDataExportEncryption withSSES3(SSES3 sSES3) {
        setSSES3(sSES3);
        return this;
    }

    /**
     * <p/>
     * 
     * @param sSEKMS
     */

    public void setSSEKMS(SSEKMS sSEKMS) {
        this.sSEKMS = sSEKMS;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public SSEKMS getSSEKMS() {
        return this.sSEKMS;
    }

    /**
     * <p/>
     * 
     * @param sSEKMS
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensDataExportEncryption withSSEKMS(SSEKMS sSEKMS) {
        setSSEKMS(sSEKMS);
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
        if (getSSES3() != null)
            sb.append("SSES3: ").append(getSSES3()).append(",");
        if (getSSEKMS() != null)
            sb.append("SSEKMS: ").append(getSSEKMS());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageLensDataExportEncryption == false)
            return false;
        StorageLensDataExportEncryption other = (StorageLensDataExportEncryption) obj;
        if (other.getSSES3() == null ^ this.getSSES3() == null)
            return false;
        if (other.getSSES3() != null && other.getSSES3().equals(this.getSSES3()) == false)
            return false;
        if (other.getSSEKMS() == null ^ this.getSSEKMS() == null)
            return false;
        if (other.getSSEKMS() != null && other.getSSEKMS().equals(this.getSSEKMS()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSSES3() == null) ? 0 : getSSES3().hashCode());
        hashCode = prime * hashCode + ((getSSEKMS() == null) ? 0 : getSSEKMS().hashCode());
        return hashCode;
    }

    @Override
    public StorageLensDataExportEncryption clone() {
        try {
            return (StorageLensDataExportEncryption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
