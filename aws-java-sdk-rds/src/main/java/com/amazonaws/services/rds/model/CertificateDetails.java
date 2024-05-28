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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Returns the details of the DB instance’s server certificate.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html">Using SSL/TLS to encrypt a
 * connection to a DB instance</a> in the <i>Amazon RDS User Guide</i> and <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL.html"> Using SSL/TLS to encrypt a
 * connection to a DB cluster</a> in the <i>Amazon Aurora User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CertificateDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The CA identifier of the CA certificate used for the DB instance's server certificate.
     * </p>
     */
    private String cAIdentifier;
    /**
     * <p>
     * The expiration date of the DB instance’s server certificate.
     * </p>
     */
    private java.util.Date validTill;

    /**
     * <p>
     * The CA identifier of the CA certificate used for the DB instance's server certificate.
     * </p>
     * 
     * @param cAIdentifier
     *        The CA identifier of the CA certificate used for the DB instance's server certificate.
     */

    public void setCAIdentifier(String cAIdentifier) {
        this.cAIdentifier = cAIdentifier;
    }

    /**
     * <p>
     * The CA identifier of the CA certificate used for the DB instance's server certificate.
     * </p>
     * 
     * @return The CA identifier of the CA certificate used for the DB instance's server certificate.
     */

    public String getCAIdentifier() {
        return this.cAIdentifier;
    }

    /**
     * <p>
     * The CA identifier of the CA certificate used for the DB instance's server certificate.
     * </p>
     * 
     * @param cAIdentifier
     *        The CA identifier of the CA certificate used for the DB instance's server certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateDetails withCAIdentifier(String cAIdentifier) {
        setCAIdentifier(cAIdentifier);
        return this;
    }

    /**
     * <p>
     * The expiration date of the DB instance’s server certificate.
     * </p>
     * 
     * @param validTill
     *        The expiration date of the DB instance’s server certificate.
     */

    public void setValidTill(java.util.Date validTill) {
        this.validTill = validTill;
    }

    /**
     * <p>
     * The expiration date of the DB instance’s server certificate.
     * </p>
     * 
     * @return The expiration date of the DB instance’s server certificate.
     */

    public java.util.Date getValidTill() {
        return this.validTill;
    }

    /**
     * <p>
     * The expiration date of the DB instance’s server certificate.
     * </p>
     * 
     * @param validTill
     *        The expiration date of the DB instance’s server certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateDetails withValidTill(java.util.Date validTill) {
        setValidTill(validTill);
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
        if (getCAIdentifier() != null)
            sb.append("CAIdentifier: ").append(getCAIdentifier()).append(",");
        if (getValidTill() != null)
            sb.append("ValidTill: ").append(getValidTill());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CertificateDetails == false)
            return false;
        CertificateDetails other = (CertificateDetails) obj;
        if (other.getCAIdentifier() == null ^ this.getCAIdentifier() == null)
            return false;
        if (other.getCAIdentifier() != null && other.getCAIdentifier().equals(this.getCAIdentifier()) == false)
            return false;
        if (other.getValidTill() == null ^ this.getValidTill() == null)
            return false;
        if (other.getValidTill() != null && other.getValidTill().equals(this.getValidTill()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCAIdentifier() == null) ? 0 : getCAIdentifier().hashCode());
        hashCode = prime * hashCode + ((getValidTill() == null) ? 0 : getValidTill().hashCode());
        return hashCode;
    }

    @Override
    public CertificateDetails clone() {
        try {
            return (CertificateDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
