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
package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information about the revision of the SNOMED-CT ontology in the response. Specifically, the details include the
 * SNOMED-CT edition, language, and version date.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/SNOMEDCTDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SNOMEDCTDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The edition of SNOMED-CT used. The edition used for the InferSNOMEDCT editions is the US edition.
     * </p>
     */
    private String edition;
    /**
     * <p>
     * The language used in the SNOMED-CT ontology. All Amazon Comprehend Medical operations are US English (en).
     * </p>
     */
    private String language;
    /**
     * <p>
     * The version date of the SNOMED-CT ontology used.
     * </p>
     */
    private String versionDate;

    /**
     * <p>
     * The edition of SNOMED-CT used. The edition used for the InferSNOMEDCT editions is the US edition.
     * </p>
     * 
     * @param edition
     *        The edition of SNOMED-CT used. The edition used for the InferSNOMEDCT editions is the US edition.
     */

    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     * <p>
     * The edition of SNOMED-CT used. The edition used for the InferSNOMEDCT editions is the US edition.
     * </p>
     * 
     * @return The edition of SNOMED-CT used. The edition used for the InferSNOMEDCT editions is the US edition.
     */

    public String getEdition() {
        return this.edition;
    }

    /**
     * <p>
     * The edition of SNOMED-CT used. The edition used for the InferSNOMEDCT editions is the US edition.
     * </p>
     * 
     * @param edition
     *        The edition of SNOMED-CT used. The edition used for the InferSNOMEDCT editions is the US edition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SNOMEDCTDetails withEdition(String edition) {
        setEdition(edition);
        return this;
    }

    /**
     * <p>
     * The language used in the SNOMED-CT ontology. All Amazon Comprehend Medical operations are US English (en).
     * </p>
     * 
     * @param language
     *        The language used in the SNOMED-CT ontology. All Amazon Comprehend Medical operations are US English (en).
     */

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The language used in the SNOMED-CT ontology. All Amazon Comprehend Medical operations are US English (en).
     * </p>
     * 
     * @return The language used in the SNOMED-CT ontology. All Amazon Comprehend Medical operations are US English
     *         (en).
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     * <p>
     * The language used in the SNOMED-CT ontology. All Amazon Comprehend Medical operations are US English (en).
     * </p>
     * 
     * @param language
     *        The language used in the SNOMED-CT ontology. All Amazon Comprehend Medical operations are US English (en).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SNOMEDCTDetails withLanguage(String language) {
        setLanguage(language);
        return this;
    }

    /**
     * <p>
     * The version date of the SNOMED-CT ontology used.
     * </p>
     * 
     * @param versionDate
     *        The version date of the SNOMED-CT ontology used.
     */

    public void setVersionDate(String versionDate) {
        this.versionDate = versionDate;
    }

    /**
     * <p>
     * The version date of the SNOMED-CT ontology used.
     * </p>
     * 
     * @return The version date of the SNOMED-CT ontology used.
     */

    public String getVersionDate() {
        return this.versionDate;
    }

    /**
     * <p>
     * The version date of the SNOMED-CT ontology used.
     * </p>
     * 
     * @param versionDate
     *        The version date of the SNOMED-CT ontology used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SNOMEDCTDetails withVersionDate(String versionDate) {
        setVersionDate(versionDate);
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
        if (getEdition() != null)
            sb.append("Edition: ").append(getEdition()).append(",");
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage()).append(",");
        if (getVersionDate() != null)
            sb.append("VersionDate: ").append(getVersionDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SNOMEDCTDetails == false)
            return false;
        SNOMEDCTDetails other = (SNOMEDCTDetails) obj;
        if (other.getEdition() == null ^ this.getEdition() == null)
            return false;
        if (other.getEdition() != null && other.getEdition().equals(this.getEdition()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getVersionDate() == null ^ this.getVersionDate() == null)
            return false;
        if (other.getVersionDate() != null && other.getVersionDate().equals(this.getVersionDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEdition() == null) ? 0 : getEdition().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getVersionDate() == null) ? 0 : getVersionDate().hashCode());
        return hashCode;
    }

    @Override
    public SNOMEDCTDetails clone() {
        try {
            return (SNOMEDCTDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehendmedical.model.transform.SNOMEDCTDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
