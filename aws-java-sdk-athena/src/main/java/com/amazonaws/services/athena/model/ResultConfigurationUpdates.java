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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information about the updates in the query results, such as output location and encryption configuration for the
 * query results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ResultConfigurationUpdates" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResultConfigurationUpdates implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location in Amazon S3 where your query results are stored, such as <code>s3://path/to/query/bucket/</code>.
     * For more information, see <a href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Queries and Query
     * Result Files.</a> If workgroup settings override client-side settings, then the query uses the location for the
     * query results and the encryption configuration that are specified for the workgroup. The
     * "workgroup settings override" is specified in EnforceWorkGroupConfiguration (true/false) in the
     * WorkGroupConfiguration. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     */
    private String outputLocation;
    /**
     * <p>
     * If set to "true", indicates that the previously-specified query results location (also known as a client-side
     * setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a
     * value is present in the OutputLocation in ResultConfigurationUpdates (the client-side setting), the
     * OutputLocation in the workgroup's ResultConfiguration will be updated with the new value. For more information,
     * see <a href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     * Override Client-Side Settings</a>.
     * </p>
     */
    private Boolean removeOutputLocation;
    /**
     * <p>
     * The encryption configuration for the query results.
     * </p>
     */
    private EncryptionConfiguration encryptionConfiguration;
    /**
     * <p>
     * If set to "true", indicates that the previously-specified encryption configuration (also known as the client-side
     * setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a
     * value is present in the EncryptionConfiguration in ResultConfigurationUpdates (the client-side setting), the
     * EncryptionConfiguration in the workgroup's ResultConfiguration will be updated with the new value. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     */
    private Boolean removeEncryptionConfiguration;

    /**
     * <p>
     * The location in Amazon S3 where your query results are stored, such as <code>s3://path/to/query/bucket/</code>.
     * For more information, see <a href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Queries and Query
     * Result Files.</a> If workgroup settings override client-side settings, then the query uses the location for the
     * query results and the encryption configuration that are specified for the workgroup. The
     * "workgroup settings override" is specified in EnforceWorkGroupConfiguration (true/false) in the
     * WorkGroupConfiguration. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * 
     * @param outputLocation
     *        The location in Amazon S3 where your query results are stored, such as
     *        <code>s3://path/to/query/bucket/</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Queries and Query Result Files.</a> If
     *        workgroup settings override client-side settings, then the query uses the location for the query results
     *        and the encryption configuration that are specified for the workgroup. The "workgroup settings override"
     *        is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See
     *        <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     */

    public void setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * The location in Amazon S3 where your query results are stored, such as <code>s3://path/to/query/bucket/</code>.
     * For more information, see <a href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Queries and Query
     * Result Files.</a> If workgroup settings override client-side settings, then the query uses the location for the
     * query results and the encryption configuration that are specified for the workgroup. The
     * "workgroup settings override" is specified in EnforceWorkGroupConfiguration (true/false) in the
     * WorkGroupConfiguration. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * 
     * @return The location in Amazon S3 where your query results are stored, such as
     *         <code>s3://path/to/query/bucket/</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Queries and Query Result Files.</a> If
     *         workgroup settings override client-side settings, then the query uses the location for the query results
     *         and the encryption configuration that are specified for the workgroup. The "workgroup settings override"
     *         is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See
     *         <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     */

    public String getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * <p>
     * The location in Amazon S3 where your query results are stored, such as <code>s3://path/to/query/bucket/</code>.
     * For more information, see <a href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Queries and Query
     * Result Files.</a> If workgroup settings override client-side settings, then the query uses the location for the
     * query results and the encryption configuration that are specified for the workgroup. The
     * "workgroup settings override" is specified in EnforceWorkGroupConfiguration (true/false) in the
     * WorkGroupConfiguration. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * 
     * @param outputLocation
     *        The location in Amazon S3 where your query results are stored, such as
     *        <code>s3://path/to/query/bucket/</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Queries and Query Result Files.</a> If
     *        workgroup settings override client-side settings, then the query uses the location for the query results
     *        and the encryption configuration that are specified for the workgroup. The "workgroup settings override"
     *        is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See
     *        <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultConfigurationUpdates withOutputLocation(String outputLocation) {
        setOutputLocation(outputLocation);
        return this;
    }

    /**
     * <p>
     * If set to "true", indicates that the previously-specified query results location (also known as a client-side
     * setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a
     * value is present in the OutputLocation in ResultConfigurationUpdates (the client-side setting), the
     * OutputLocation in the workgroup's ResultConfiguration will be updated with the new value. For more information,
     * see <a href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     * Override Client-Side Settings</a>.
     * </p>
     * 
     * @param removeOutputLocation
     *        If set to "true", indicates that the previously-specified query results location (also known as a
     *        client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false" or
     *        not set, and a value is present in the OutputLocation in ResultConfigurationUpdates (the client-side
     *        setting), the OutputLocation in the workgroup's ResultConfiguration will be updated with the new value.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *        Override Client-Side Settings</a>.
     */

    public void setRemoveOutputLocation(Boolean removeOutputLocation) {
        this.removeOutputLocation = removeOutputLocation;
    }

    /**
     * <p>
     * If set to "true", indicates that the previously-specified query results location (also known as a client-side
     * setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a
     * value is present in the OutputLocation in ResultConfigurationUpdates (the client-side setting), the
     * OutputLocation in the workgroup's ResultConfiguration will be updated with the new value. For more information,
     * see <a href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     * Override Client-Side Settings</a>.
     * </p>
     * 
     * @return If set to "true", indicates that the previously-specified query results location (also known as a
     *         client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false"
     *         or not set, and a value is present in the OutputLocation in ResultConfigurationUpdates (the client-side
     *         setting), the OutputLocation in the workgroup's ResultConfiguration will be updated with the new value.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *         Override Client-Side Settings</a>.
     */

    public Boolean getRemoveOutputLocation() {
        return this.removeOutputLocation;
    }

    /**
     * <p>
     * If set to "true", indicates that the previously-specified query results location (also known as a client-side
     * setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a
     * value is present in the OutputLocation in ResultConfigurationUpdates (the client-side setting), the
     * OutputLocation in the workgroup's ResultConfiguration will be updated with the new value. For more information,
     * see <a href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     * Override Client-Side Settings</a>.
     * </p>
     * 
     * @param removeOutputLocation
     *        If set to "true", indicates that the previously-specified query results location (also known as a
     *        client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false" or
     *        not set, and a value is present in the OutputLocation in ResultConfigurationUpdates (the client-side
     *        setting), the OutputLocation in the workgroup's ResultConfiguration will be updated with the new value.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *        Override Client-Side Settings</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultConfigurationUpdates withRemoveOutputLocation(Boolean removeOutputLocation) {
        setRemoveOutputLocation(removeOutputLocation);
        return this;
    }

    /**
     * <p>
     * If set to "true", indicates that the previously-specified query results location (also known as a client-side
     * setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a
     * value is present in the OutputLocation in ResultConfigurationUpdates (the client-side setting), the
     * OutputLocation in the workgroup's ResultConfiguration will be updated with the new value. For more information,
     * see <a href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     * Override Client-Side Settings</a>.
     * </p>
     * 
     * @return If set to "true", indicates that the previously-specified query results location (also known as a
     *         client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false"
     *         or not set, and a value is present in the OutputLocation in ResultConfigurationUpdates (the client-side
     *         setting), the OutputLocation in the workgroup's ResultConfiguration will be updated with the new value.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *         Override Client-Side Settings</a>.
     */

    public Boolean isRemoveOutputLocation() {
        return this.removeOutputLocation;
    }

    /**
     * <p>
     * The encryption configuration for the query results.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption configuration for the query results.
     */

    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration for the query results.
     * </p>
     * 
     * @return The encryption configuration for the query results.
     */

    public EncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration for the query results.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption configuration for the query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultConfigurationUpdates withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * If set to "true", indicates that the previously-specified encryption configuration (also known as the client-side
     * setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a
     * value is present in the EncryptionConfiguration in ResultConfigurationUpdates (the client-side setting), the
     * EncryptionConfiguration in the workgroup's ResultConfiguration will be updated with the new value. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @param removeEncryptionConfiguration
     *        If set to "true", indicates that the previously-specified encryption configuration (also known as the
     *        client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false" or
     *        not set, and a value is present in the EncryptionConfiguration in ResultConfigurationUpdates (the
     *        client-side setting), the EncryptionConfiguration in the workgroup's ResultConfiguration will be updated
     *        with the new value. For more information, see <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *        Override Client-Side Settings</a>.
     */

    public void setRemoveEncryptionConfiguration(Boolean removeEncryptionConfiguration) {
        this.removeEncryptionConfiguration = removeEncryptionConfiguration;
    }

    /**
     * <p>
     * If set to "true", indicates that the previously-specified encryption configuration (also known as the client-side
     * setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a
     * value is present in the EncryptionConfiguration in ResultConfigurationUpdates (the client-side setting), the
     * EncryptionConfiguration in the workgroup's ResultConfiguration will be updated with the new value. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @return If set to "true", indicates that the previously-specified encryption configuration (also known as the
     *         client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false"
     *         or not set, and a value is present in the EncryptionConfiguration in ResultConfigurationUpdates (the
     *         client-side setting), the EncryptionConfiguration in the workgroup's ResultConfiguration will be updated
     *         with the new value. For more information, see <a
     *         href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *         Override Client-Side Settings</a>.
     */

    public Boolean getRemoveEncryptionConfiguration() {
        return this.removeEncryptionConfiguration;
    }

    /**
     * <p>
     * If set to "true", indicates that the previously-specified encryption configuration (also known as the client-side
     * setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a
     * value is present in the EncryptionConfiguration in ResultConfigurationUpdates (the client-side setting), the
     * EncryptionConfiguration in the workgroup's ResultConfiguration will be updated with the new value. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @param removeEncryptionConfiguration
     *        If set to "true", indicates that the previously-specified encryption configuration (also known as the
     *        client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false" or
     *        not set, and a value is present in the EncryptionConfiguration in ResultConfigurationUpdates (the
     *        client-side setting), the EncryptionConfiguration in the workgroup's ResultConfiguration will be updated
     *        with the new value. For more information, see <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *        Override Client-Side Settings</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultConfigurationUpdates withRemoveEncryptionConfiguration(Boolean removeEncryptionConfiguration) {
        setRemoveEncryptionConfiguration(removeEncryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * If set to "true", indicates that the previously-specified encryption configuration (also known as the client-side
     * setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a
     * value is present in the EncryptionConfiguration in ResultConfigurationUpdates (the client-side setting), the
     * EncryptionConfiguration in the workgroup's ResultConfiguration will be updated with the new value. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @return If set to "true", indicates that the previously-specified encryption configuration (also known as the
     *         client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false"
     *         or not set, and a value is present in the EncryptionConfiguration in ResultConfigurationUpdates (the
     *         client-side setting), the EncryptionConfiguration in the workgroup's ResultConfiguration will be updated
     *         with the new value. For more information, see <a
     *         href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *         Override Client-Side Settings</a>.
     */

    public Boolean isRemoveEncryptionConfiguration() {
        return this.removeEncryptionConfiguration;
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
        if (getOutputLocation() != null)
            sb.append("OutputLocation: ").append(getOutputLocation()).append(",");
        if (getRemoveOutputLocation() != null)
            sb.append("RemoveOutputLocation: ").append(getRemoveOutputLocation()).append(",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration()).append(",");
        if (getRemoveEncryptionConfiguration() != null)
            sb.append("RemoveEncryptionConfiguration: ").append(getRemoveEncryptionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultConfigurationUpdates == false)
            return false;
        ResultConfigurationUpdates other = (ResultConfigurationUpdates) obj;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        if (other.getRemoveOutputLocation() == null ^ this.getRemoveOutputLocation() == null)
            return false;
        if (other.getRemoveOutputLocation() != null && other.getRemoveOutputLocation().equals(this.getRemoveOutputLocation()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        if (other.getRemoveEncryptionConfiguration() == null ^ this.getRemoveEncryptionConfiguration() == null)
            return false;
        if (other.getRemoveEncryptionConfiguration() != null
                && other.getRemoveEncryptionConfiguration().equals(this.getRemoveEncryptionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        hashCode = prime * hashCode + ((getRemoveOutputLocation() == null) ? 0 : getRemoveOutputLocation().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRemoveEncryptionConfiguration() == null) ? 0 : getRemoveEncryptionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ResultConfigurationUpdates clone() {
        try {
            return (ResultConfigurationUpdates) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.ResultConfigurationUpdatesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
