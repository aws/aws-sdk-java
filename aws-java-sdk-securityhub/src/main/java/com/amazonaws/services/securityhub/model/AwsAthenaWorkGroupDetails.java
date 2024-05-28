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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an Amazon Athena workgroup.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAthenaWorkGroupDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAthenaWorkGroupDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The workgroup name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The workgroup description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Whether the workgroup is enabled or disabled.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The configuration of the workgroup, which includes the location in Amazon Simple Storage Service (Amazon S3)
     * where query results are stored, the encryption option, if any, used for query results, whether Amazon CloudWatch
     * metrics are enabled for the workgroup, and the limit for the amount of bytes scanned (cutoff) per query, if it is
     * specified.
     * </p>
     */
    private AwsAthenaWorkGroupConfigurationDetails configuration;

    /**
     * <p>
     * The workgroup name.
     * </p>
     * 
     * @param name
     *        The workgroup name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The workgroup name.
     * </p>
     * 
     * @return The workgroup name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The workgroup name.
     * </p>
     * 
     * @param name
     *        The workgroup name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAthenaWorkGroupDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The workgroup description.
     * </p>
     * 
     * @param description
     *        The workgroup description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The workgroup description.
     * </p>
     * 
     * @return The workgroup description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The workgroup description.
     * </p>
     * 
     * @param description
     *        The workgroup description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAthenaWorkGroupDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Whether the workgroup is enabled or disabled.
     * </p>
     * 
     * @param state
     *        Whether the workgroup is enabled or disabled.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Whether the workgroup is enabled or disabled.
     * </p>
     * 
     * @return Whether the workgroup is enabled or disabled.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Whether the workgroup is enabled or disabled.
     * </p>
     * 
     * @param state
     *        Whether the workgroup is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAthenaWorkGroupDetails withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The configuration of the workgroup, which includes the location in Amazon Simple Storage Service (Amazon S3)
     * where query results are stored, the encryption option, if any, used for query results, whether Amazon CloudWatch
     * metrics are enabled for the workgroup, and the limit for the amount of bytes scanned (cutoff) per query, if it is
     * specified.
     * </p>
     * 
     * @param configuration
     *        The configuration of the workgroup, which includes the location in Amazon Simple Storage Service (Amazon
     *        S3) where query results are stored, the encryption option, if any, used for query results, whether Amazon
     *        CloudWatch metrics are enabled for the workgroup, and the limit for the amount of bytes scanned (cutoff)
     *        per query, if it is specified.
     */

    public void setConfiguration(AwsAthenaWorkGroupConfigurationDetails configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration of the workgroup, which includes the location in Amazon Simple Storage Service (Amazon S3)
     * where query results are stored, the encryption option, if any, used for query results, whether Amazon CloudWatch
     * metrics are enabled for the workgroup, and the limit for the amount of bytes scanned (cutoff) per query, if it is
     * specified.
     * </p>
     * 
     * @return The configuration of the workgroup, which includes the location in Amazon Simple Storage Service (Amazon
     *         S3) where query results are stored, the encryption option, if any, used for query results, whether Amazon
     *         CloudWatch metrics are enabled for the workgroup, and the limit for the amount of bytes scanned (cutoff)
     *         per query, if it is specified.
     */

    public AwsAthenaWorkGroupConfigurationDetails getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration of the workgroup, which includes the location in Amazon Simple Storage Service (Amazon S3)
     * where query results are stored, the encryption option, if any, used for query results, whether Amazon CloudWatch
     * metrics are enabled for the workgroup, and the limit for the amount of bytes scanned (cutoff) per query, if it is
     * specified.
     * </p>
     * 
     * @param configuration
     *        The configuration of the workgroup, which includes the location in Amazon Simple Storage Service (Amazon
     *        S3) where query results are stored, the encryption option, if any, used for query results, whether Amazon
     *        CloudWatch metrics are enabled for the workgroup, and the limit for the amount of bytes scanned (cutoff)
     *        per query, if it is specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAthenaWorkGroupDetails withConfiguration(AwsAthenaWorkGroupConfigurationDetails configuration) {
        setConfiguration(configuration);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsAthenaWorkGroupDetails == false)
            return false;
        AwsAthenaWorkGroupDetails other = (AwsAthenaWorkGroupDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public AwsAthenaWorkGroupDetails clone() {
        try {
            return (AwsAthenaWorkGroupDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAthenaWorkGroupDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
