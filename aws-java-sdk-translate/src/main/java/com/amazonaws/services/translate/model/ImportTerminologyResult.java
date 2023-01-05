/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ImportTerminology" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportTerminologyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The properties of the custom terminology being imported.
     * </p>
     */
    private TerminologyProperties terminologyProperties;
    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings that were produced by your input file. This
     * file was created when Amazon Translate attempted to create a terminology resource. The location is returned as a
     * presigned URL to that has a 30 minute expiration.
     * </p>
     */
    private TerminologyDataLocation auxiliaryDataLocation;

    /**
     * <p>
     * The properties of the custom terminology being imported.
     * </p>
     * 
     * @param terminologyProperties
     *        The properties of the custom terminology being imported.
     */

    public void setTerminologyProperties(TerminologyProperties terminologyProperties) {
        this.terminologyProperties = terminologyProperties;
    }

    /**
     * <p>
     * The properties of the custom terminology being imported.
     * </p>
     * 
     * @return The properties of the custom terminology being imported.
     */

    public TerminologyProperties getTerminologyProperties() {
        return this.terminologyProperties;
    }

    /**
     * <p>
     * The properties of the custom terminology being imported.
     * </p>
     * 
     * @param terminologyProperties
     *        The properties of the custom terminology being imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTerminologyResult withTerminologyProperties(TerminologyProperties terminologyProperties) {
        setTerminologyProperties(terminologyProperties);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings that were produced by your input file. This
     * file was created when Amazon Translate attempted to create a terminology resource. The location is returned as a
     * presigned URL to that has a 30 minute expiration.
     * </p>
     * 
     * @param auxiliaryDataLocation
     *        The Amazon S3 location of a file that provides any errors or warnings that were produced by your input
     *        file. This file was created when Amazon Translate attempted to create a terminology resource. The location
     *        is returned as a presigned URL to that has a 30 minute expiration.
     */

    public void setAuxiliaryDataLocation(TerminologyDataLocation auxiliaryDataLocation) {
        this.auxiliaryDataLocation = auxiliaryDataLocation;
    }

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings that were produced by your input file. This
     * file was created when Amazon Translate attempted to create a terminology resource. The location is returned as a
     * presigned URL to that has a 30 minute expiration.
     * </p>
     * 
     * @return The Amazon S3 location of a file that provides any errors or warnings that were produced by your input
     *         file. This file was created when Amazon Translate attempted to create a terminology resource. The
     *         location is returned as a presigned URL to that has a 30 minute expiration.
     */

    public TerminologyDataLocation getAuxiliaryDataLocation() {
        return this.auxiliaryDataLocation;
    }

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings that were produced by your input file. This
     * file was created when Amazon Translate attempted to create a terminology resource. The location is returned as a
     * presigned URL to that has a 30 minute expiration.
     * </p>
     * 
     * @param auxiliaryDataLocation
     *        The Amazon S3 location of a file that provides any errors or warnings that were produced by your input
     *        file. This file was created when Amazon Translate attempted to create a terminology resource. The location
     *        is returned as a presigned URL to that has a 30 minute expiration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTerminologyResult withAuxiliaryDataLocation(TerminologyDataLocation auxiliaryDataLocation) {
        setAuxiliaryDataLocation(auxiliaryDataLocation);
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
        if (getTerminologyProperties() != null)
            sb.append("TerminologyProperties: ").append(getTerminologyProperties()).append(",");
        if (getAuxiliaryDataLocation() != null)
            sb.append("AuxiliaryDataLocation: ").append(getAuxiliaryDataLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportTerminologyResult == false)
            return false;
        ImportTerminologyResult other = (ImportTerminologyResult) obj;
        if (other.getTerminologyProperties() == null ^ this.getTerminologyProperties() == null)
            return false;
        if (other.getTerminologyProperties() != null && other.getTerminologyProperties().equals(this.getTerminologyProperties()) == false)
            return false;
        if (other.getAuxiliaryDataLocation() == null ^ this.getAuxiliaryDataLocation() == null)
            return false;
        if (other.getAuxiliaryDataLocation() != null && other.getAuxiliaryDataLocation().equals(this.getAuxiliaryDataLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTerminologyProperties() == null) ? 0 : getTerminologyProperties().hashCode());
        hashCode = prime * hashCode + ((getAuxiliaryDataLocation() == null) ? 0 : getAuxiliaryDataLocation().hashCode());
        return hashCode;
    }

    @Override
    public ImportTerminologyResult clone() {
        try {
            return (ImportTerminologyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
