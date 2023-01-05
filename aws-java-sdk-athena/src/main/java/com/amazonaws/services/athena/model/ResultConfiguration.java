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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The location in Amazon S3 where query results are stored and the encryption option, if any, used for query results.
 * These are known as "client-side settings". If workgroup settings override client-side settings, then the query uses
 * the workgroup settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ResultConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResultConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location in Amazon S3 where your query results are stored, such as <code>s3://path/to/query/bucket/</code>.
     * To run the query, you must specify the query results location using one of the ways: either for individual
     * queries using either this setting (client-side), or in the workgroup, using <a>WorkGroupConfiguration</a>. If
     * none of them is set, Athena issues an error that no output location is provided. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query Results</a>. If workgroup settings
     * override client-side settings, then the query uses the settings specified for the workgroup. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     */
    private String outputLocation;
    /**
     * <p>
     * If query results are encrypted in Amazon S3, indicates the encryption option used (for example,
     * <code>SSE_KMS</code> or <code>CSE_KMS</code>) and key information. This is a client-side setting. If workgroup
     * settings override client-side settings, then the query uses the encryption configuration that is specified for
     * the workgroup, and also uses the location for storing query results specified in the workgroup. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     */
    private EncryptionConfiguration encryptionConfiguration;
    /**
     * <p>
     * The Amazon Web Services account ID that you expect to be the owner of the Amazon S3 bucket specified by
     * <a>ResultConfiguration$OutputLocation</a>. If set, Athena uses the value for <code>ExpectedBucketOwner</code>
     * when it makes Amazon S3 calls to your specified output location. If the <code>ExpectedBucketOwner</code> Amazon
     * Web Services account ID does not match the actual owner of the Amazon S3 bucket, the call fails with a
     * permissions error.
     * </p>
     * <p>
     * This is a client-side setting. If workgroup settings override client-side settings, then the query uses the
     * <code>ExpectedBucketOwner</code> setting that is specified for the workgroup, and also uses the location for
     * storing query results specified in the workgroup. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>
     * and <a href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     * Override Client-Side Settings</a>.
     * </p>
     */
    private String expectedBucketOwner;
    /**
     * <p>
     * Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query results. Currently the
     * only supported canned ACL is <code>BUCKET_OWNER_FULL_CONTROL</code>. This is a client-side setting. If workgroup
     * settings override client-side settings, then the query uses the ACL configuration that is specified for the
     * workgroup, and also uses the location for storing query results specified in the workgroup. For more information,
     * see <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     */
    private AclConfiguration aclConfiguration;

    /**
     * <p>
     * The location in Amazon S3 where your query results are stored, such as <code>s3://path/to/query/bucket/</code>.
     * To run the query, you must specify the query results location using one of the ways: either for individual
     * queries using either this setting (client-side), or in the workgroup, using <a>WorkGroupConfiguration</a>. If
     * none of them is set, Athena issues an error that no output location is provided. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query Results</a>. If workgroup settings
     * override client-side settings, then the query uses the settings specified for the workgroup. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * 
     * @param outputLocation
     *        The location in Amazon S3 where your query results are stored, such as
     *        <code>s3://path/to/query/bucket/</code>. To run the query, you must specify the query results location
     *        using one of the ways: either for individual queries using either this setting (client-side), or in the
     *        workgroup, using <a>WorkGroupConfiguration</a>. If none of them is set, Athena issues an error that no
     *        output location is provided. For more information, see <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query Results</a>. If workgroup settings
     *        override client-side settings, then the query uses the settings specified for the workgroup. See
     *        <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     */

    public void setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * The location in Amazon S3 where your query results are stored, such as <code>s3://path/to/query/bucket/</code>.
     * To run the query, you must specify the query results location using one of the ways: either for individual
     * queries using either this setting (client-side), or in the workgroup, using <a>WorkGroupConfiguration</a>. If
     * none of them is set, Athena issues an error that no output location is provided. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query Results</a>. If workgroup settings
     * override client-side settings, then the query uses the settings specified for the workgroup. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * 
     * @return The location in Amazon S3 where your query results are stored, such as
     *         <code>s3://path/to/query/bucket/</code>. To run the query, you must specify the query results location
     *         using one of the ways: either for individual queries using either this setting (client-side), or in the
     *         workgroup, using <a>WorkGroupConfiguration</a>. If none of them is set, Athena issues an error that no
     *         output location is provided. For more information, see <a
     *         href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query Results</a>. If workgroup
     *         settings override client-side settings, then the query uses the settings specified for the workgroup. See
     *         <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     */

    public String getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * <p>
     * The location in Amazon S3 where your query results are stored, such as <code>s3://path/to/query/bucket/</code>.
     * To run the query, you must specify the query results location using one of the ways: either for individual
     * queries using either this setting (client-side), or in the workgroup, using <a>WorkGroupConfiguration</a>. If
     * none of them is set, Athena issues an error that no output location is provided. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query Results</a>. If workgroup settings
     * override client-side settings, then the query uses the settings specified for the workgroup. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * 
     * @param outputLocation
     *        The location in Amazon S3 where your query results are stored, such as
     *        <code>s3://path/to/query/bucket/</code>. To run the query, you must specify the query results location
     *        using one of the ways: either for individual queries using either this setting (client-side), or in the
     *        workgroup, using <a>WorkGroupConfiguration</a>. If none of them is set, Athena issues an error that no
     *        output location is provided. For more information, see <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query Results</a>. If workgroup settings
     *        override client-side settings, then the query uses the settings specified for the workgroup. See
     *        <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultConfiguration withOutputLocation(String outputLocation) {
        setOutputLocation(outputLocation);
        return this;
    }

    /**
     * <p>
     * If query results are encrypted in Amazon S3, indicates the encryption option used (for example,
     * <code>SSE_KMS</code> or <code>CSE_KMS</code>) and key information. This is a client-side setting. If workgroup
     * settings override client-side settings, then the query uses the encryption configuration that is specified for
     * the workgroup, and also uses the location for storing query results specified in the workgroup. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @param encryptionConfiguration
     *        If query results are encrypted in Amazon S3, indicates the encryption option used (for example,
     *        <code>SSE_KMS</code> or <code>CSE_KMS</code>) and key information. This is a client-side setting. If
     *        workgroup settings override client-side settings, then the query uses the encryption configuration that is
     *        specified for the workgroup, and also uses the location for storing query results specified in the
     *        workgroup. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *        Override Client-Side Settings</a>.
     */

    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * If query results are encrypted in Amazon S3, indicates the encryption option used (for example,
     * <code>SSE_KMS</code> or <code>CSE_KMS</code>) and key information. This is a client-side setting. If workgroup
     * settings override client-side settings, then the query uses the encryption configuration that is specified for
     * the workgroup, and also uses the location for storing query results specified in the workgroup. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @return If query results are encrypted in Amazon S3, indicates the encryption option used (for example,
     *         <code>SSE_KMS</code> or <code>CSE_KMS</code>) and key information. This is a client-side setting. If
     *         workgroup settings override client-side settings, then the query uses the encryption configuration that
     *         is specified for the workgroup, and also uses the location for storing query results specified in the
     *         workgroup. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a
     *         href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *         Override Client-Side Settings</a>.
     */

    public EncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * If query results are encrypted in Amazon S3, indicates the encryption option used (for example,
     * <code>SSE_KMS</code> or <code>CSE_KMS</code>) and key information. This is a client-side setting. If workgroup
     * settings override client-side settings, then the query uses the encryption configuration that is specified for
     * the workgroup, and also uses the location for storing query results specified in the workgroup. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @param encryptionConfiguration
     *        If query results are encrypted in Amazon S3, indicates the encryption option used (for example,
     *        <code>SSE_KMS</code> or <code>CSE_KMS</code>) and key information. This is a client-side setting. If
     *        workgroup settings override client-side settings, then the query uses the encryption configuration that is
     *        specified for the workgroup, and also uses the location for storing query results specified in the
     *        workgroup. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *        Override Client-Side Settings</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultConfiguration withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that you expect to be the owner of the Amazon S3 bucket specified by
     * <a>ResultConfiguration$OutputLocation</a>. If set, Athena uses the value for <code>ExpectedBucketOwner</code>
     * when it makes Amazon S3 calls to your specified output location. If the <code>ExpectedBucketOwner</code> Amazon
     * Web Services account ID does not match the actual owner of the Amazon S3 bucket, the call fails with a
     * permissions error.
     * </p>
     * <p>
     * This is a client-side setting. If workgroup settings override client-side settings, then the query uses the
     * <code>ExpectedBucketOwner</code> setting that is specified for the workgroup, and also uses the location for
     * storing query results specified in the workgroup. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>
     * and <a href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     * Override Client-Side Settings</a>.
     * </p>
     * 
     * @param expectedBucketOwner
     *        The Amazon Web Services account ID that you expect to be the owner of the Amazon S3 bucket specified by
     *        <a>ResultConfiguration$OutputLocation</a>. If set, Athena uses the value for
     *        <code>ExpectedBucketOwner</code> when it makes Amazon S3 calls to your specified output location. If the
     *        <code>ExpectedBucketOwner</code> Amazon Web Services account ID does not match the actual owner of the
     *        Amazon S3 bucket, the call fails with a permissions error.</p>
     *        <p>
     *        This is a client-side setting. If workgroup settings override client-side settings, then the query uses
     *        the <code>ExpectedBucketOwner</code> setting that is specified for the workgroup, and also uses the
     *        location for storing query results specified in the workgroup. See
     *        <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *        Override Client-Side Settings</a>.
     */

    public void setExpectedBucketOwner(String expectedBucketOwner) {
        this.expectedBucketOwner = expectedBucketOwner;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that you expect to be the owner of the Amazon S3 bucket specified by
     * <a>ResultConfiguration$OutputLocation</a>. If set, Athena uses the value for <code>ExpectedBucketOwner</code>
     * when it makes Amazon S3 calls to your specified output location. If the <code>ExpectedBucketOwner</code> Amazon
     * Web Services account ID does not match the actual owner of the Amazon S3 bucket, the call fails with a
     * permissions error.
     * </p>
     * <p>
     * This is a client-side setting. If workgroup settings override client-side settings, then the query uses the
     * <code>ExpectedBucketOwner</code> setting that is specified for the workgroup, and also uses the location for
     * storing query results specified in the workgroup. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>
     * and <a href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     * Override Client-Side Settings</a>.
     * </p>
     * 
     * @return The Amazon Web Services account ID that you expect to be the owner of the Amazon S3 bucket specified by
     *         <a>ResultConfiguration$OutputLocation</a>. If set, Athena uses the value for
     *         <code>ExpectedBucketOwner</code> when it makes Amazon S3 calls to your specified output location. If the
     *         <code>ExpectedBucketOwner</code> Amazon Web Services account ID does not match the actual owner of the
     *         Amazon S3 bucket, the call fails with a permissions error.</p>
     *         <p>
     *         This is a client-side setting. If workgroup settings override client-side settings, then the query uses
     *         the <code>ExpectedBucketOwner</code> setting that is specified for the workgroup, and also uses the
     *         location for storing query results specified in the workgroup. See
     *         <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a
     *         href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *         Override Client-Side Settings</a>.
     */

    public String getExpectedBucketOwner() {
        return this.expectedBucketOwner;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that you expect to be the owner of the Amazon S3 bucket specified by
     * <a>ResultConfiguration$OutputLocation</a>. If set, Athena uses the value for <code>ExpectedBucketOwner</code>
     * when it makes Amazon S3 calls to your specified output location. If the <code>ExpectedBucketOwner</code> Amazon
     * Web Services account ID does not match the actual owner of the Amazon S3 bucket, the call fails with a
     * permissions error.
     * </p>
     * <p>
     * This is a client-side setting. If workgroup settings override client-side settings, then the query uses the
     * <code>ExpectedBucketOwner</code> setting that is specified for the workgroup, and also uses the location for
     * storing query results specified in the workgroup. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>
     * and <a href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     * Override Client-Side Settings</a>.
     * </p>
     * 
     * @param expectedBucketOwner
     *        The Amazon Web Services account ID that you expect to be the owner of the Amazon S3 bucket specified by
     *        <a>ResultConfiguration$OutputLocation</a>. If set, Athena uses the value for
     *        <code>ExpectedBucketOwner</code> when it makes Amazon S3 calls to your specified output location. If the
     *        <code>ExpectedBucketOwner</code> Amazon Web Services account ID does not match the actual owner of the
     *        Amazon S3 bucket, the call fails with a permissions error.</p>
     *        <p>
     *        This is a client-side setting. If workgroup settings override client-side settings, then the query uses
     *        the <code>ExpectedBucketOwner</code> setting that is specified for the workgroup, and also uses the
     *        location for storing query results specified in the workgroup. See
     *        <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *        Override Client-Side Settings</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultConfiguration withExpectedBucketOwner(String expectedBucketOwner) {
        setExpectedBucketOwner(expectedBucketOwner);
        return this;
    }

    /**
     * <p>
     * Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query results. Currently the
     * only supported canned ACL is <code>BUCKET_OWNER_FULL_CONTROL</code>. This is a client-side setting. If workgroup
     * settings override client-side settings, then the query uses the ACL configuration that is specified for the
     * workgroup, and also uses the location for storing query results specified in the workgroup. For more information,
     * see <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @param aclConfiguration
     *        Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query results.
     *        Currently the only supported canned ACL is <code>BUCKET_OWNER_FULL_CONTROL</code>. This is a client-side
     *        setting. If workgroup settings override client-side settings, then the query uses the ACL configuration
     *        that is specified for the workgroup, and also uses the location for storing query results specified in the
     *        workgroup. For more information, see <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *        Override Client-Side Settings</a>.
     */

    public void setAclConfiguration(AclConfiguration aclConfiguration) {
        this.aclConfiguration = aclConfiguration;
    }

    /**
     * <p>
     * Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query results. Currently the
     * only supported canned ACL is <code>BUCKET_OWNER_FULL_CONTROL</code>. This is a client-side setting. If workgroup
     * settings override client-side settings, then the query uses the ACL configuration that is specified for the
     * workgroup, and also uses the location for storing query results specified in the workgroup. For more information,
     * see <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @return Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query results.
     *         Currently the only supported canned ACL is <code>BUCKET_OWNER_FULL_CONTROL</code>. This is a client-side
     *         setting. If workgroup settings override client-side settings, then the query uses the ACL configuration
     *         that is specified for the workgroup, and also uses the location for storing query results specified in
     *         the workgroup. For more information, see <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and
     *         <a href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup
     *         Settings Override Client-Side Settings</a>.
     */

    public AclConfiguration getAclConfiguration() {
        return this.aclConfiguration;
    }

    /**
     * <p>
     * Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query results. Currently the
     * only supported canned ACL is <code>BUCKET_OWNER_FULL_CONTROL</code>. This is a client-side setting. If workgroup
     * settings override client-side settings, then the query uses the ACL configuration that is specified for the
     * workgroup, and also uses the location for storing query results specified in the workgroup. For more information,
     * see <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @param aclConfiguration
     *        Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query results.
     *        Currently the only supported canned ACL is <code>BUCKET_OWNER_FULL_CONTROL</code>. This is a client-side
     *        setting. If workgroup settings override client-side settings, then the query uses the ACL configuration
     *        that is specified for the workgroup, and also uses the location for storing query results specified in the
     *        workgroup. For more information, see <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *        Override Client-Side Settings</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultConfiguration withAclConfiguration(AclConfiguration aclConfiguration) {
        setAclConfiguration(aclConfiguration);
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
        if (getOutputLocation() != null)
            sb.append("OutputLocation: ").append(getOutputLocation()).append(",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration()).append(",");
        if (getExpectedBucketOwner() != null)
            sb.append("ExpectedBucketOwner: ").append(getExpectedBucketOwner()).append(",");
        if (getAclConfiguration() != null)
            sb.append("AclConfiguration: ").append(getAclConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultConfiguration == false)
            return false;
        ResultConfiguration other = (ResultConfiguration) obj;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        if (other.getExpectedBucketOwner() == null ^ this.getExpectedBucketOwner() == null)
            return false;
        if (other.getExpectedBucketOwner() != null && other.getExpectedBucketOwner().equals(this.getExpectedBucketOwner()) == false)
            return false;
        if (other.getAclConfiguration() == null ^ this.getAclConfiguration() == null)
            return false;
        if (other.getAclConfiguration() != null && other.getAclConfiguration().equals(this.getAclConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getExpectedBucketOwner() == null) ? 0 : getExpectedBucketOwner().hashCode());
        hashCode = prime * hashCode + ((getAclConfiguration() == null) ? 0 : getAclConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ResultConfiguration clone() {
        try {
            return (ResultConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.ResultConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
