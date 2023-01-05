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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the allow lists, custom data identifiers, and managed data identifiers to include (use) when performing
 * automated sensitive data discovery for an Amazon Macie account. The configuration must specify at least one custom
 * data identifier or managed data identifier. For information about the managed data identifiers that Amazon Macie
 * currently provides, see <a href="https://docs.aws.amazon.com/macie/latest/user/managed-data-identifiers.html">Using
 * managed data identifiers</a> in the <i>Amazon Macie User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/SensitivityInspectionTemplateIncludes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SensitivityInspectionTemplateIncludes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of unique identifiers, one for each allow list to include.
     * </p>
     */
    private java.util.List<String> allowListIds;
    /**
     * <p>
     * An array of unique identifiers, one for each custom data identifier to include.
     * </p>
     */
    private java.util.List<String> customDataIdentifierIds;
    /**
     * <p>
     * An array of unique identifiers, one for each managed data identifier to include.
     * </p>
     * <p>
     * Amazon Macie uses these managed data identifiers in addition to managed data identifiers that are subsequently
     * released and recommended for automated sensitive data discovery. To retrieve a list of valid values for the
     * managed data identifiers that are currently available, use the ListManagedDataIdentifiers operation.
     * </p>
     * <para/>
     */
    private java.util.List<String> managedDataIdentifierIds;

    /**
     * <p>
     * An array of unique identifiers, one for each allow list to include.
     * </p>
     * 
     * @return An array of unique identifiers, one for each allow list to include.
     */

    public java.util.List<String> getAllowListIds() {
        return allowListIds;
    }

    /**
     * <p>
     * An array of unique identifiers, one for each allow list to include.
     * </p>
     * 
     * @param allowListIds
     *        An array of unique identifiers, one for each allow list to include.
     */

    public void setAllowListIds(java.util.Collection<String> allowListIds) {
        if (allowListIds == null) {
            this.allowListIds = null;
            return;
        }

        this.allowListIds = new java.util.ArrayList<String>(allowListIds);
    }

    /**
     * <p>
     * An array of unique identifiers, one for each allow list to include.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowListIds(java.util.Collection)} or {@link #withAllowListIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param allowListIds
     *        An array of unique identifiers, one for each allow list to include.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensitivityInspectionTemplateIncludes withAllowListIds(String... allowListIds) {
        if (this.allowListIds == null) {
            setAllowListIds(new java.util.ArrayList<String>(allowListIds.length));
        }
        for (String ele : allowListIds) {
            this.allowListIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of unique identifiers, one for each allow list to include.
     * </p>
     * 
     * @param allowListIds
     *        An array of unique identifiers, one for each allow list to include.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensitivityInspectionTemplateIncludes withAllowListIds(java.util.Collection<String> allowListIds) {
        setAllowListIds(allowListIds);
        return this;
    }

    /**
     * <p>
     * An array of unique identifiers, one for each custom data identifier to include.
     * </p>
     * 
     * @return An array of unique identifiers, one for each custom data identifier to include.
     */

    public java.util.List<String> getCustomDataIdentifierIds() {
        return customDataIdentifierIds;
    }

    /**
     * <p>
     * An array of unique identifiers, one for each custom data identifier to include.
     * </p>
     * 
     * @param customDataIdentifierIds
     *        An array of unique identifiers, one for each custom data identifier to include.
     */

    public void setCustomDataIdentifierIds(java.util.Collection<String> customDataIdentifierIds) {
        if (customDataIdentifierIds == null) {
            this.customDataIdentifierIds = null;
            return;
        }

        this.customDataIdentifierIds = new java.util.ArrayList<String>(customDataIdentifierIds);
    }

    /**
     * <p>
     * An array of unique identifiers, one for each custom data identifier to include.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomDataIdentifierIds(java.util.Collection)} or
     * {@link #withCustomDataIdentifierIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param customDataIdentifierIds
     *        An array of unique identifiers, one for each custom data identifier to include.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensitivityInspectionTemplateIncludes withCustomDataIdentifierIds(String... customDataIdentifierIds) {
        if (this.customDataIdentifierIds == null) {
            setCustomDataIdentifierIds(new java.util.ArrayList<String>(customDataIdentifierIds.length));
        }
        for (String ele : customDataIdentifierIds) {
            this.customDataIdentifierIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of unique identifiers, one for each custom data identifier to include.
     * </p>
     * 
     * @param customDataIdentifierIds
     *        An array of unique identifiers, one for each custom data identifier to include.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensitivityInspectionTemplateIncludes withCustomDataIdentifierIds(java.util.Collection<String> customDataIdentifierIds) {
        setCustomDataIdentifierIds(customDataIdentifierIds);
        return this;
    }

    /**
     * <p>
     * An array of unique identifiers, one for each managed data identifier to include.
     * </p>
     * <p>
     * Amazon Macie uses these managed data identifiers in addition to managed data identifiers that are subsequently
     * released and recommended for automated sensitive data discovery. To retrieve a list of valid values for the
     * managed data identifiers that are currently available, use the ListManagedDataIdentifiers operation.
     * </p>
     * <para/>
     * 
     * @return An array of unique identifiers, one for each managed data identifier to include.</p>
     *         <p>
     *         Amazon Macie uses these managed data identifiers in addition to managed data identifiers that are
     *         subsequently released and recommended for automated sensitive data discovery. To retrieve a list of valid
     *         values for the managed data identifiers that are currently available, use the ListManagedDataIdentifiers
     *         operation.
     *         </p>
     */

    public java.util.List<String> getManagedDataIdentifierIds() {
        return managedDataIdentifierIds;
    }

    /**
     * <p>
     * An array of unique identifiers, one for each managed data identifier to include.
     * </p>
     * <p>
     * Amazon Macie uses these managed data identifiers in addition to managed data identifiers that are subsequently
     * released and recommended for automated sensitive data discovery. To retrieve a list of valid values for the
     * managed data identifiers that are currently available, use the ListManagedDataIdentifiers operation.
     * </p>
     * <para/>
     * 
     * @param managedDataIdentifierIds
     *        An array of unique identifiers, one for each managed data identifier to include.</p>
     *        <p>
     *        Amazon Macie uses these managed data identifiers in addition to managed data identifiers that are
     *        subsequently released and recommended for automated sensitive data discovery. To retrieve a list of valid
     *        values for the managed data identifiers that are currently available, use the ListManagedDataIdentifiers
     *        operation.
     *        </p>
     */

    public void setManagedDataIdentifierIds(java.util.Collection<String> managedDataIdentifierIds) {
        if (managedDataIdentifierIds == null) {
            this.managedDataIdentifierIds = null;
            return;
        }

        this.managedDataIdentifierIds = new java.util.ArrayList<String>(managedDataIdentifierIds);
    }

    /**
     * <p>
     * An array of unique identifiers, one for each managed data identifier to include.
     * </p>
     * <p>
     * Amazon Macie uses these managed data identifiers in addition to managed data identifiers that are subsequently
     * released and recommended for automated sensitive data discovery. To retrieve a list of valid values for the
     * managed data identifiers that are currently available, use the ListManagedDataIdentifiers operation.
     * </p>
     * <para/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManagedDataIdentifierIds(java.util.Collection)} or
     * {@link #withManagedDataIdentifierIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param managedDataIdentifierIds
     *        An array of unique identifiers, one for each managed data identifier to include.</p>
     *        <p>
     *        Amazon Macie uses these managed data identifiers in addition to managed data identifiers that are
     *        subsequently released and recommended for automated sensitive data discovery. To retrieve a list of valid
     *        values for the managed data identifiers that are currently available, use the ListManagedDataIdentifiers
     *        operation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensitivityInspectionTemplateIncludes withManagedDataIdentifierIds(String... managedDataIdentifierIds) {
        if (this.managedDataIdentifierIds == null) {
            setManagedDataIdentifierIds(new java.util.ArrayList<String>(managedDataIdentifierIds.length));
        }
        for (String ele : managedDataIdentifierIds) {
            this.managedDataIdentifierIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of unique identifiers, one for each managed data identifier to include.
     * </p>
     * <p>
     * Amazon Macie uses these managed data identifiers in addition to managed data identifiers that are subsequently
     * released and recommended for automated sensitive data discovery. To retrieve a list of valid values for the
     * managed data identifiers that are currently available, use the ListManagedDataIdentifiers operation.
     * </p>
     * <para/>
     * 
     * @param managedDataIdentifierIds
     *        An array of unique identifiers, one for each managed data identifier to include.</p>
     *        <p>
     *        Amazon Macie uses these managed data identifiers in addition to managed data identifiers that are
     *        subsequently released and recommended for automated sensitive data discovery. To retrieve a list of valid
     *        values for the managed data identifiers that are currently available, use the ListManagedDataIdentifiers
     *        operation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensitivityInspectionTemplateIncludes withManagedDataIdentifierIds(java.util.Collection<String> managedDataIdentifierIds) {
        setManagedDataIdentifierIds(managedDataIdentifierIds);
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
        if (getAllowListIds() != null)
            sb.append("AllowListIds: ").append(getAllowListIds()).append(",");
        if (getCustomDataIdentifierIds() != null)
            sb.append("CustomDataIdentifierIds: ").append(getCustomDataIdentifierIds()).append(",");
        if (getManagedDataIdentifierIds() != null)
            sb.append("ManagedDataIdentifierIds: ").append(getManagedDataIdentifierIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SensitivityInspectionTemplateIncludes == false)
            return false;
        SensitivityInspectionTemplateIncludes other = (SensitivityInspectionTemplateIncludes) obj;
        if (other.getAllowListIds() == null ^ this.getAllowListIds() == null)
            return false;
        if (other.getAllowListIds() != null && other.getAllowListIds().equals(this.getAllowListIds()) == false)
            return false;
        if (other.getCustomDataIdentifierIds() == null ^ this.getCustomDataIdentifierIds() == null)
            return false;
        if (other.getCustomDataIdentifierIds() != null && other.getCustomDataIdentifierIds().equals(this.getCustomDataIdentifierIds()) == false)
            return false;
        if (other.getManagedDataIdentifierIds() == null ^ this.getManagedDataIdentifierIds() == null)
            return false;
        if (other.getManagedDataIdentifierIds() != null && other.getManagedDataIdentifierIds().equals(this.getManagedDataIdentifierIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowListIds() == null) ? 0 : getAllowListIds().hashCode());
        hashCode = prime * hashCode + ((getCustomDataIdentifierIds() == null) ? 0 : getCustomDataIdentifierIds().hashCode());
        hashCode = prime * hashCode + ((getManagedDataIdentifierIds() == null) ? 0 : getManagedDataIdentifierIds().hashCode());
        return hashCode;
    }

    @Override
    public SensitivityInspectionTemplateIncludes clone() {
        try {
            return (SensitivityInspectionTemplateIncludes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.SensitivityInspectionTemplateIncludesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
