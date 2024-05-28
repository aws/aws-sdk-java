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
 * The configuration of the workgroup, which includes the location in Amazon Simple Storage Service (Amazon S3) where
 * query results are stored, the encryption option, if any, used for query results, whether Amazon CloudWatch metrics
 * are enabled for the workgroup, and the limit for the amount of bytes scanned (cutoff) per query, if it is specified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAthenaWorkGroupConfigurationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAthenaWorkGroupConfigurationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location in Amazon S3 where query and calculation results are stored and the encryption option, if any, used
     * for query and calculation results. These are known as client-side settings. If workgroup settings override
     * client-side settings, then the query uses the workgroup settings.
     * </p>
     */
    private AwsAthenaWorkGroupConfigurationResultConfigurationDetails resultConfiguration;

    /**
     * <p>
     * The location in Amazon S3 where query and calculation results are stored and the encryption option, if any, used
     * for query and calculation results. These are known as client-side settings. If workgroup settings override
     * client-side settings, then the query uses the workgroup settings.
     * </p>
     * 
     * @param resultConfiguration
     *        The location in Amazon S3 where query and calculation results are stored and the encryption option, if
     *        any, used for query and calculation results. These are known as client-side settings. If workgroup
     *        settings override client-side settings, then the query uses the workgroup settings.
     */

    public void setResultConfiguration(AwsAthenaWorkGroupConfigurationResultConfigurationDetails resultConfiguration) {
        this.resultConfiguration = resultConfiguration;
    }

    /**
     * <p>
     * The location in Amazon S3 where query and calculation results are stored and the encryption option, if any, used
     * for query and calculation results. These are known as client-side settings. If workgroup settings override
     * client-side settings, then the query uses the workgroup settings.
     * </p>
     * 
     * @return The location in Amazon S3 where query and calculation results are stored and the encryption option, if
     *         any, used for query and calculation results. These are known as client-side settings. If workgroup
     *         settings override client-side settings, then the query uses the workgroup settings.
     */

    public AwsAthenaWorkGroupConfigurationResultConfigurationDetails getResultConfiguration() {
        return this.resultConfiguration;
    }

    /**
     * <p>
     * The location in Amazon S3 where query and calculation results are stored and the encryption option, if any, used
     * for query and calculation results. These are known as client-side settings. If workgroup settings override
     * client-side settings, then the query uses the workgroup settings.
     * </p>
     * 
     * @param resultConfiguration
     *        The location in Amazon S3 where query and calculation results are stored and the encryption option, if
     *        any, used for query and calculation results. These are known as client-side settings. If workgroup
     *        settings override client-side settings, then the query uses the workgroup settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAthenaWorkGroupConfigurationDetails withResultConfiguration(AwsAthenaWorkGroupConfigurationResultConfigurationDetails resultConfiguration) {
        setResultConfiguration(resultConfiguration);
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
        if (getResultConfiguration() != null)
            sb.append("ResultConfiguration: ").append(getResultConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsAthenaWorkGroupConfigurationDetails == false)
            return false;
        AwsAthenaWorkGroupConfigurationDetails other = (AwsAthenaWorkGroupConfigurationDetails) obj;
        if (other.getResultConfiguration() == null ^ this.getResultConfiguration() == null)
            return false;
        if (other.getResultConfiguration() != null && other.getResultConfiguration().equals(this.getResultConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResultConfiguration() == null) ? 0 : getResultConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public AwsAthenaWorkGroupConfigurationDetails clone() {
        try {
            return (AwsAthenaWorkGroupConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAthenaWorkGroupConfigurationDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
