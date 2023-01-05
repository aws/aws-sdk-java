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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Automatically enable new organization accounts as member accounts from an Amazon Security Lake administrator account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/AutoEnableNewRegionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoEnableNewRegionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services Regions where Security Lake is automatically enabled.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The Amazon Web Services sources that are automatically enabled in Security Lake.
     * </p>
     */
    private java.util.List<String> sources;

    /**
     * <p>
     * The Amazon Web Services Regions where Security Lake is automatically enabled.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Regions where Security Lake is automatically enabled.
     * @see Region
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Regions where Security Lake is automatically enabled.
     * </p>
     * 
     * @return The Amazon Web Services Regions where Security Lake is automatically enabled.
     * @see Region
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Regions where Security Lake is automatically enabled.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Regions where Security Lake is automatically enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Region
     */

    public AutoEnableNewRegionConfiguration withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Regions where Security Lake is automatically enabled.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Regions where Security Lake is automatically enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Region
     */

    public AutoEnableNewRegionConfiguration withRegion(Region region) {
        this.region = region.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services sources that are automatically enabled in Security Lake.
     * </p>
     * 
     * @return The Amazon Web Services sources that are automatically enabled in Security Lake.
     * @see AwsLogSourceType
     */

    public java.util.List<String> getSources() {
        return sources;
    }

    /**
     * <p>
     * The Amazon Web Services sources that are automatically enabled in Security Lake.
     * </p>
     * 
     * @param sources
     *        The Amazon Web Services sources that are automatically enabled in Security Lake.
     * @see AwsLogSourceType
     */

    public void setSources(java.util.Collection<String> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<String>(sources);
    }

    /**
     * <p>
     * The Amazon Web Services sources that are automatically enabled in Security Lake.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The Amazon Web Services sources that are automatically enabled in Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AwsLogSourceType
     */

    public AutoEnableNewRegionConfiguration withSources(String... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<String>(sources.length));
        }
        for (String ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services sources that are automatically enabled in Security Lake.
     * </p>
     * 
     * @param sources
     *        The Amazon Web Services sources that are automatically enabled in Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AwsLogSourceType
     */

    public AutoEnableNewRegionConfiguration withSources(java.util.Collection<String> sources) {
        setSources(sources);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services sources that are automatically enabled in Security Lake.
     * </p>
     * 
     * @param sources
     *        The Amazon Web Services sources that are automatically enabled in Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AwsLogSourceType
     */

    public AutoEnableNewRegionConfiguration withSources(AwsLogSourceType... sources) {
        java.util.ArrayList<String> sourcesCopy = new java.util.ArrayList<String>(sources.length);
        for (AwsLogSourceType value : sources) {
            sourcesCopy.add(value.toString());
        }
        if (getSources() == null) {
            setSources(sourcesCopy);
        } else {
            getSources().addAll(sourcesCopy);
        }
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
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoEnableNewRegionConfiguration == false)
            return false;
        AutoEnableNewRegionConfiguration other = (AutoEnableNewRegionConfiguration) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        return hashCode;
    }

    @Override
    public AutoEnableNewRegionConfiguration clone() {
        try {
            return (AutoEnableNewRegionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.AutoEnableNewRegionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
