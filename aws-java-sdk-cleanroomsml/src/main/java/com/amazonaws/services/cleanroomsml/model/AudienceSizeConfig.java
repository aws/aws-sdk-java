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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configure the list of audience output sizes that can be created. A request to <a>StartAudienceGenerationJob</a> that
 * uses this configured audience model must have an <code>audienceSize</code> selected from this list. You can use the
 * <code>ABSOLUTE</code> <a>AudienceSize</a> to configure out audience sizes using the count of identifiers in the
 * output. You can use the <code>Percentage</code> <a>AudienceSize</a> to configure sizes in the range 1-100 percent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/AudienceSizeConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudienceSizeConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of the different audience output sizes.
     * </p>
     */
    private java.util.List<Integer> audienceSizeBins;
    /**
     * <p>
     * Whether the audience output sizes are defined as an absolute number or a percentage.
     * </p>
     */
    private String audienceSizeType;

    /**
     * <p>
     * An array of the different audience output sizes.
     * </p>
     * 
     * @return An array of the different audience output sizes.
     */

    public java.util.List<Integer> getAudienceSizeBins() {
        return audienceSizeBins;
    }

    /**
     * <p>
     * An array of the different audience output sizes.
     * </p>
     * 
     * @param audienceSizeBins
     *        An array of the different audience output sizes.
     */

    public void setAudienceSizeBins(java.util.Collection<Integer> audienceSizeBins) {
        if (audienceSizeBins == null) {
            this.audienceSizeBins = null;
            return;
        }

        this.audienceSizeBins = new java.util.ArrayList<Integer>(audienceSizeBins);
    }

    /**
     * <p>
     * An array of the different audience output sizes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAudienceSizeBins(java.util.Collection)} or {@link #withAudienceSizeBins(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param audienceSizeBins
     *        An array of the different audience output sizes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceSizeConfig withAudienceSizeBins(Integer... audienceSizeBins) {
        if (this.audienceSizeBins == null) {
            setAudienceSizeBins(new java.util.ArrayList<Integer>(audienceSizeBins.length));
        }
        for (Integer ele : audienceSizeBins) {
            this.audienceSizeBins.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the different audience output sizes.
     * </p>
     * 
     * @param audienceSizeBins
     *        An array of the different audience output sizes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceSizeConfig withAudienceSizeBins(java.util.Collection<Integer> audienceSizeBins) {
        setAudienceSizeBins(audienceSizeBins);
        return this;
    }

    /**
     * <p>
     * Whether the audience output sizes are defined as an absolute number or a percentage.
     * </p>
     * 
     * @param audienceSizeType
     *        Whether the audience output sizes are defined as an absolute number or a percentage.
     * @see AudienceSizeType
     */

    public void setAudienceSizeType(String audienceSizeType) {
        this.audienceSizeType = audienceSizeType;
    }

    /**
     * <p>
     * Whether the audience output sizes are defined as an absolute number or a percentage.
     * </p>
     * 
     * @return Whether the audience output sizes are defined as an absolute number or a percentage.
     * @see AudienceSizeType
     */

    public String getAudienceSizeType() {
        return this.audienceSizeType;
    }

    /**
     * <p>
     * Whether the audience output sizes are defined as an absolute number or a percentage.
     * </p>
     * 
     * @param audienceSizeType
     *        Whether the audience output sizes are defined as an absolute number or a percentage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudienceSizeType
     */

    public AudienceSizeConfig withAudienceSizeType(String audienceSizeType) {
        setAudienceSizeType(audienceSizeType);
        return this;
    }

    /**
     * <p>
     * Whether the audience output sizes are defined as an absolute number or a percentage.
     * </p>
     * 
     * @param audienceSizeType
     *        Whether the audience output sizes are defined as an absolute number or a percentage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudienceSizeType
     */

    public AudienceSizeConfig withAudienceSizeType(AudienceSizeType audienceSizeType) {
        this.audienceSizeType = audienceSizeType.toString();
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
        if (getAudienceSizeBins() != null)
            sb.append("AudienceSizeBins: ").append(getAudienceSizeBins()).append(",");
        if (getAudienceSizeType() != null)
            sb.append("AudienceSizeType: ").append(getAudienceSizeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudienceSizeConfig == false)
            return false;
        AudienceSizeConfig other = (AudienceSizeConfig) obj;
        if (other.getAudienceSizeBins() == null ^ this.getAudienceSizeBins() == null)
            return false;
        if (other.getAudienceSizeBins() != null && other.getAudienceSizeBins().equals(this.getAudienceSizeBins()) == false)
            return false;
        if (other.getAudienceSizeType() == null ^ this.getAudienceSizeType() == null)
            return false;
        if (other.getAudienceSizeType() != null && other.getAudienceSizeType().equals(this.getAudienceSizeType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudienceSizeBins() == null) ? 0 : getAudienceSizeBins().hashCode());
        hashCode = prime * hashCode + ((getAudienceSizeType() == null) ? 0 : getAudienceSizeType().hashCode());
        return hashCode;
    }

    @Override
    public AudienceSizeConfig clone() {
        try {
            return (AudienceSizeConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanroomsml.model.transform.AudienceSizeConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
