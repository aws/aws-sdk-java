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
     * For more information, see <a href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query Results</a>
     * If workgroup settings override client-side settings, then the query uses the location for the query results and
     * the encryption configuration that are specified for the workgroup. The "workgroup settings override" is specified
     * in <code>EnforceWorkGroupConfiguration</code> (true/false) in the <code>WorkGroupConfiguration</code>. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     */
    private String outputLocation;
    /**
     * <p>
     * If set to "true", indicates that the previously-specified query results location (also known as a client-side
     * setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a
     * value is present in the <code>OutputLocation</code> in <code>ResultConfigurationUpdates</code> (the client-side
     * setting), the <code>OutputLocation</code> in the workgroup's <code>ResultConfiguration</code> will be updated
     * with the new value. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
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
     * value is present in the <code>EncryptionConfiguration</code> in <code>ResultConfigurationUpdates</code> (the
     * client-side setting), the <code>EncryptionConfiguration</code> in the workgroup's
     * <code>ResultConfiguration</code> will be updated with the new value. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     */
    private Boolean removeEncryptionConfiguration;
    /**
     * <p>
     * The Amazon Web Services account ID that you expect to be the owner of the Amazon S3 bucket specified by
     * <a>ResultConfiguration$OutputLocation</a>. If set, Athena uses the value for <code>ExpectedBucketOwner</code>
     * when it makes Amazon S3 calls to your specified output location. If the <code>ExpectedBucketOwner</code> Amazon
     * Web Services account ID does not match the actual owner of the Amazon S3 bucket, the call fails with a
     * permissions error.
     * </p>
     * <p>
     * If workgroup settings override client-side settings, then the query uses the <code>ExpectedBucketOwner</code>
     * setting that is specified for the workgroup, and also uses the location for storing query results specified in
     * the workgroup. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     */
    private String expectedBucketOwner;
    /**
     * <p>
     * If set to "true", removes the Amazon Web Services account ID previously specified for
     * <a>ResultConfiguration$ExpectedBucketOwner</a>. If set to "false" or not set, and a value is present in the
     * <code>ExpectedBucketOwner</code> in <code>ResultConfigurationUpdates</code> (the client-side setting), the
     * <code>ExpectedBucketOwner</code> in the workgroup's <code>ResultConfiguration</code> is updated with the new
     * value. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     */
    private Boolean removeExpectedBucketOwner;
    /**
     * <p>
     * The ACL configuration for the query results.
     * </p>
     */
    private AclConfiguration aclConfiguration;
    /**
     * <p>
     * If set to <code>true</code>, indicates that the previously-specified ACL configuration for queries in this
     * workgroup should be ignored and set to null. If set to <code>false</code> or not set, and a value is present in
     * the <code>AclConfiguration</code> of <code>ResultConfigurationUpdates</code>, the <code>AclConfiguration</code>
     * in the workgroup's <code>ResultConfiguration</code> is updated with the new value. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     */
    private Boolean removeAclConfiguration;

    /**
     * <p>
     * The location in Amazon S3 where your query results are stored, such as <code>s3://path/to/query/bucket/</code>.
     * For more information, see <a href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query Results</a>
     * If workgroup settings override client-side settings, then the query uses the location for the query results and
     * the encryption configuration that are specified for the workgroup. The "workgroup settings override" is specified
     * in <code>EnforceWorkGroupConfiguration</code> (true/false) in the <code>WorkGroupConfiguration</code>. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * 
     * @param outputLocation
     *        The location in Amazon S3 where your query results are stored, such as
     *        <code>s3://path/to/query/bucket/</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query Results</a> If workgroup settings
     *        override client-side settings, then the query uses the location for the query results and the encryption
     *        configuration that are specified for the workgroup. The "workgroup settings override" is specified in
     *        <code>EnforceWorkGroupConfiguration</code> (true/false) in the <code>WorkGroupConfiguration</code>. See
     *        <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     */

    public void setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * The location in Amazon S3 where your query results are stored, such as <code>s3://path/to/query/bucket/</code>.
     * For more information, see <a href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query Results</a>
     * If workgroup settings override client-side settings, then the query uses the location for the query results and
     * the encryption configuration that are specified for the workgroup. The "workgroup settings override" is specified
     * in <code>EnforceWorkGroupConfiguration</code> (true/false) in the <code>WorkGroupConfiguration</code>. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * 
     * @return The location in Amazon S3 where your query results are stored, such as
     *         <code>s3://path/to/query/bucket/</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query Results</a> If workgroup settings
     *         override client-side settings, then the query uses the location for the query results and the encryption
     *         configuration that are specified for the workgroup. The "workgroup settings override" is specified in
     *         <code>EnforceWorkGroupConfiguration</code> (true/false) in the <code>WorkGroupConfiguration</code>. See
     *         <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     */

    public String getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * <p>
     * The location in Amazon S3 where your query results are stored, such as <code>s3://path/to/query/bucket/</code>.
     * For more information, see <a href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query Results</a>
     * If workgroup settings override client-side settings, then the query uses the location for the query results and
     * the encryption configuration that are specified for the workgroup. The "workgroup settings override" is specified
     * in <code>EnforceWorkGroupConfiguration</code> (true/false) in the <code>WorkGroupConfiguration</code>. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * 
     * @param outputLocation
     *        The location in Amazon S3 where your query results are stored, such as
     *        <code>s3://path/to/query/bucket/</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query Results</a> If workgroup settings
     *        override client-side settings, then the query uses the location for the query results and the encryption
     *        configuration that are specified for the workgroup. The "workgroup settings override" is specified in
     *        <code>EnforceWorkGroupConfiguration</code> (true/false) in the <code>WorkGroupConfiguration</code>. See
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
     * value is present in the <code>OutputLocation</code> in <code>ResultConfigurationUpdates</code> (the client-side
     * setting), the <code>OutputLocation</code> in the workgroup's <code>ResultConfiguration</code> will be updated
     * with the new value. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @param removeOutputLocation
     *        If set to "true", indicates that the previously-specified query results location (also known as a
     *        client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false" or
     *        not set, and a value is present in the <code>OutputLocation</code> in
     *        <code>ResultConfigurationUpdates</code> (the client-side setting), the <code>OutputLocation</code> in the
     *        workgroup's <code>ResultConfiguration</code> will be updated with the new value. For more information, see
     *        <a href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup
     *        Settings Override Client-Side Settings</a>.
     */

    public void setRemoveOutputLocation(Boolean removeOutputLocation) {
        this.removeOutputLocation = removeOutputLocation;
    }

    /**
     * <p>
     * If set to "true", indicates that the previously-specified query results location (also known as a client-side
     * setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a
     * value is present in the <code>OutputLocation</code> in <code>ResultConfigurationUpdates</code> (the client-side
     * setting), the <code>OutputLocation</code> in the workgroup's <code>ResultConfiguration</code> will be updated
     * with the new value. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @return If set to "true", indicates that the previously-specified query results location (also known as a
     *         client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false"
     *         or not set, and a value is present in the <code>OutputLocation</code> in
     *         <code>ResultConfigurationUpdates</code> (the client-side setting), the <code>OutputLocation</code> in the
     *         workgroup's <code>ResultConfiguration</code> will be updated with the new value. For more information,
     *         see <a href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup
     *         Settings Override Client-Side Settings</a>.
     */

    public Boolean getRemoveOutputLocation() {
        return this.removeOutputLocation;
    }

    /**
     * <p>
     * If set to "true", indicates that the previously-specified query results location (also known as a client-side
     * setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a
     * value is present in the <code>OutputLocation</code> in <code>ResultConfigurationUpdates</code> (the client-side
     * setting), the <code>OutputLocation</code> in the workgroup's <code>ResultConfiguration</code> will be updated
     * with the new value. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @param removeOutputLocation
     *        If set to "true", indicates that the previously-specified query results location (also known as a
     *        client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false" or
     *        not set, and a value is present in the <code>OutputLocation</code> in
     *        <code>ResultConfigurationUpdates</code> (the client-side setting), the <code>OutputLocation</code> in the
     *        workgroup's <code>ResultConfiguration</code> will be updated with the new value. For more information, see
     *        <a href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup
     *        Settings Override Client-Side Settings</a>.
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
     * value is present in the <code>OutputLocation</code> in <code>ResultConfigurationUpdates</code> (the client-side
     * setting), the <code>OutputLocation</code> in the workgroup's <code>ResultConfiguration</code> will be updated
     * with the new value. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @return If set to "true", indicates that the previously-specified query results location (also known as a
     *         client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false"
     *         or not set, and a value is present in the <code>OutputLocation</code> in
     *         <code>ResultConfigurationUpdates</code> (the client-side setting), the <code>OutputLocation</code> in the
     *         workgroup's <code>ResultConfiguration</code> will be updated with the new value. For more information,
     *         see <a href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup
     *         Settings Override Client-Side Settings</a>.
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
     * value is present in the <code>EncryptionConfiguration</code> in <code>ResultConfigurationUpdates</code> (the
     * client-side setting), the <code>EncryptionConfiguration</code> in the workgroup's
     * <code>ResultConfiguration</code> will be updated with the new value. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @param removeEncryptionConfiguration
     *        If set to "true", indicates that the previously-specified encryption configuration (also known as the
     *        client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false" or
     *        not set, and a value is present in the <code>EncryptionConfiguration</code> in
     *        <code>ResultConfigurationUpdates</code> (the client-side setting), the
     *        <code>EncryptionConfiguration</code> in the workgroup's <code>ResultConfiguration</code> will be updated
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
     * value is present in the <code>EncryptionConfiguration</code> in <code>ResultConfigurationUpdates</code> (the
     * client-side setting), the <code>EncryptionConfiguration</code> in the workgroup's
     * <code>ResultConfiguration</code> will be updated with the new value. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @return If set to "true", indicates that the previously-specified encryption configuration (also known as the
     *         client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false"
     *         or not set, and a value is present in the <code>EncryptionConfiguration</code> in
     *         <code>ResultConfigurationUpdates</code> (the client-side setting), the
     *         <code>EncryptionConfiguration</code> in the workgroup's <code>ResultConfiguration</code> will be updated
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
     * value is present in the <code>EncryptionConfiguration</code> in <code>ResultConfigurationUpdates</code> (the
     * client-side setting), the <code>EncryptionConfiguration</code> in the workgroup's
     * <code>ResultConfiguration</code> will be updated with the new value. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @param removeEncryptionConfiguration
     *        If set to "true", indicates that the previously-specified encryption configuration (also known as the
     *        client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false" or
     *        not set, and a value is present in the <code>EncryptionConfiguration</code> in
     *        <code>ResultConfigurationUpdates</code> (the client-side setting), the
     *        <code>EncryptionConfiguration</code> in the workgroup's <code>ResultConfiguration</code> will be updated
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
     * value is present in the <code>EncryptionConfiguration</code> in <code>ResultConfigurationUpdates</code> (the
     * client-side setting), the <code>EncryptionConfiguration</code> in the workgroup's
     * <code>ResultConfiguration</code> will be updated with the new value. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @return If set to "true", indicates that the previously-specified encryption configuration (also known as the
     *         client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false"
     *         or not set, and a value is present in the <code>EncryptionConfiguration</code> in
     *         <code>ResultConfigurationUpdates</code> (the client-side setting), the
     *         <code>EncryptionConfiguration</code> in the workgroup's <code>ResultConfiguration</code> will be updated
     *         with the new value. For more information, see <a
     *         href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *         Override Client-Side Settings</a>.
     */

    public Boolean isRemoveEncryptionConfiguration() {
        return this.removeEncryptionConfiguration;
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
     * If workgroup settings override client-side settings, then the query uses the <code>ExpectedBucketOwner</code>
     * setting that is specified for the workgroup, and also uses the location for storing query results specified in
     * the workgroup. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @param expectedBucketOwner
     *        The Amazon Web Services account ID that you expect to be the owner of the Amazon S3 bucket specified by
     *        <a>ResultConfiguration$OutputLocation</a>. If set, Athena uses the value for
     *        <code>ExpectedBucketOwner</code> when it makes Amazon S3 calls to your specified output location. If the
     *        <code>ExpectedBucketOwner</code> Amazon Web Services account ID does not match the actual owner of the
     *        Amazon S3 bucket, the call fails with a permissions error.</p>
     *        <p>
     *        If workgroup settings override client-side settings, then the query uses the
     *        <code>ExpectedBucketOwner</code> setting that is specified for the workgroup, and also uses the location
     *        for storing query results specified in the workgroup. See
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
     * If workgroup settings override client-side settings, then the query uses the <code>ExpectedBucketOwner</code>
     * setting that is specified for the workgroup, and also uses the location for storing query results specified in
     * the workgroup. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @return The Amazon Web Services account ID that you expect to be the owner of the Amazon S3 bucket specified by
     *         <a>ResultConfiguration$OutputLocation</a>. If set, Athena uses the value for
     *         <code>ExpectedBucketOwner</code> when it makes Amazon S3 calls to your specified output location. If the
     *         <code>ExpectedBucketOwner</code> Amazon Web Services account ID does not match the actual owner of the
     *         Amazon S3 bucket, the call fails with a permissions error.</p>
     *         <p>
     *         If workgroup settings override client-side settings, then the query uses the
     *         <code>ExpectedBucketOwner</code> setting that is specified for the workgroup, and also uses the location
     *         for storing query results specified in the workgroup. See
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
     * If workgroup settings override client-side settings, then the query uses the <code>ExpectedBucketOwner</code>
     * setting that is specified for the workgroup, and also uses the location for storing query results specified in
     * the workgroup. See <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @param expectedBucketOwner
     *        The Amazon Web Services account ID that you expect to be the owner of the Amazon S3 bucket specified by
     *        <a>ResultConfiguration$OutputLocation</a>. If set, Athena uses the value for
     *        <code>ExpectedBucketOwner</code> when it makes Amazon S3 calls to your specified output location. If the
     *        <code>ExpectedBucketOwner</code> Amazon Web Services account ID does not match the actual owner of the
     *        Amazon S3 bucket, the call fails with a permissions error.</p>
     *        <p>
     *        If workgroup settings override client-side settings, then the query uses the
     *        <code>ExpectedBucketOwner</code> setting that is specified for the workgroup, and also uses the location
     *        for storing query results specified in the workgroup. See
     *        <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *        Override Client-Side Settings</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultConfigurationUpdates withExpectedBucketOwner(String expectedBucketOwner) {
        setExpectedBucketOwner(expectedBucketOwner);
        return this;
    }

    /**
     * <p>
     * If set to "true", removes the Amazon Web Services account ID previously specified for
     * <a>ResultConfiguration$ExpectedBucketOwner</a>. If set to "false" or not set, and a value is present in the
     * <code>ExpectedBucketOwner</code> in <code>ResultConfigurationUpdates</code> (the client-side setting), the
     * <code>ExpectedBucketOwner</code> in the workgroup's <code>ResultConfiguration</code> is updated with the new
     * value. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @param removeExpectedBucketOwner
     *        If set to "true", removes the Amazon Web Services account ID previously specified for
     *        <a>ResultConfiguration$ExpectedBucketOwner</a>. If set to "false" or not set, and a value is present in
     *        the <code>ExpectedBucketOwner</code> in <code>ResultConfigurationUpdates</code> (the client-side setting),
     *        the <code>ExpectedBucketOwner</code> in the workgroup's <code>ResultConfiguration</code> is updated with
     *        the new value. For more information, see <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *        Override Client-Side Settings</a>.
     */

    public void setRemoveExpectedBucketOwner(Boolean removeExpectedBucketOwner) {
        this.removeExpectedBucketOwner = removeExpectedBucketOwner;
    }

    /**
     * <p>
     * If set to "true", removes the Amazon Web Services account ID previously specified for
     * <a>ResultConfiguration$ExpectedBucketOwner</a>. If set to "false" or not set, and a value is present in the
     * <code>ExpectedBucketOwner</code> in <code>ResultConfigurationUpdates</code> (the client-side setting), the
     * <code>ExpectedBucketOwner</code> in the workgroup's <code>ResultConfiguration</code> is updated with the new
     * value. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @return If set to "true", removes the Amazon Web Services account ID previously specified for
     *         <a>ResultConfiguration$ExpectedBucketOwner</a>. If set to "false" or not set, and a value is present in
     *         the <code>ExpectedBucketOwner</code> in <code>ResultConfigurationUpdates</code> (the client-side
     *         setting), the <code>ExpectedBucketOwner</code> in the workgroup's <code>ResultConfiguration</code> is
     *         updated with the new value. For more information, see <a
     *         href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *         Override Client-Side Settings</a>.
     */

    public Boolean getRemoveExpectedBucketOwner() {
        return this.removeExpectedBucketOwner;
    }

    /**
     * <p>
     * If set to "true", removes the Amazon Web Services account ID previously specified for
     * <a>ResultConfiguration$ExpectedBucketOwner</a>. If set to "false" or not set, and a value is present in the
     * <code>ExpectedBucketOwner</code> in <code>ResultConfigurationUpdates</code> (the client-side setting), the
     * <code>ExpectedBucketOwner</code> in the workgroup's <code>ResultConfiguration</code> is updated with the new
     * value. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @param removeExpectedBucketOwner
     *        If set to "true", removes the Amazon Web Services account ID previously specified for
     *        <a>ResultConfiguration$ExpectedBucketOwner</a>. If set to "false" or not set, and a value is present in
     *        the <code>ExpectedBucketOwner</code> in <code>ResultConfigurationUpdates</code> (the client-side setting),
     *        the <code>ExpectedBucketOwner</code> in the workgroup's <code>ResultConfiguration</code> is updated with
     *        the new value. For more information, see <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *        Override Client-Side Settings</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultConfigurationUpdates withRemoveExpectedBucketOwner(Boolean removeExpectedBucketOwner) {
        setRemoveExpectedBucketOwner(removeExpectedBucketOwner);
        return this;
    }

    /**
     * <p>
     * If set to "true", removes the Amazon Web Services account ID previously specified for
     * <a>ResultConfiguration$ExpectedBucketOwner</a>. If set to "false" or not set, and a value is present in the
     * <code>ExpectedBucketOwner</code> in <code>ResultConfigurationUpdates</code> (the client-side setting), the
     * <code>ExpectedBucketOwner</code> in the workgroup's <code>ResultConfiguration</code> is updated with the new
     * value. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @return If set to "true", removes the Amazon Web Services account ID previously specified for
     *         <a>ResultConfiguration$ExpectedBucketOwner</a>. If set to "false" or not set, and a value is present in
     *         the <code>ExpectedBucketOwner</code> in <code>ResultConfigurationUpdates</code> (the client-side
     *         setting), the <code>ExpectedBucketOwner</code> in the workgroup's <code>ResultConfiguration</code> is
     *         updated with the new value. For more information, see <a
     *         href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *         Override Client-Side Settings</a>.
     */

    public Boolean isRemoveExpectedBucketOwner() {
        return this.removeExpectedBucketOwner;
    }

    /**
     * <p>
     * The ACL configuration for the query results.
     * </p>
     * 
     * @param aclConfiguration
     *        The ACL configuration for the query results.
     */

    public void setAclConfiguration(AclConfiguration aclConfiguration) {
        this.aclConfiguration = aclConfiguration;
    }

    /**
     * <p>
     * The ACL configuration for the query results.
     * </p>
     * 
     * @return The ACL configuration for the query results.
     */

    public AclConfiguration getAclConfiguration() {
        return this.aclConfiguration;
    }

    /**
     * <p>
     * The ACL configuration for the query results.
     * </p>
     * 
     * @param aclConfiguration
     *        The ACL configuration for the query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultConfigurationUpdates withAclConfiguration(AclConfiguration aclConfiguration) {
        setAclConfiguration(aclConfiguration);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, indicates that the previously-specified ACL configuration for queries in this
     * workgroup should be ignored and set to null. If set to <code>false</code> or not set, and a value is present in
     * the <code>AclConfiguration</code> of <code>ResultConfigurationUpdates</code>, the <code>AclConfiguration</code>
     * in the workgroup's <code>ResultConfiguration</code> is updated with the new value. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @param removeAclConfiguration
     *        If set to <code>true</code>, indicates that the previously-specified ACL configuration for queries in this
     *        workgroup should be ignored and set to null. If set to <code>false</code> or not set, and a value is
     *        present in the <code>AclConfiguration</code> of <code>ResultConfigurationUpdates</code>, the
     *        <code>AclConfiguration</code> in the workgroup's <code>ResultConfiguration</code> is updated with the new
     *        value. For more information, see <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *        Override Client-Side Settings</a>.
     */

    public void setRemoveAclConfiguration(Boolean removeAclConfiguration) {
        this.removeAclConfiguration = removeAclConfiguration;
    }

    /**
     * <p>
     * If set to <code>true</code>, indicates that the previously-specified ACL configuration for queries in this
     * workgroup should be ignored and set to null. If set to <code>false</code> or not set, and a value is present in
     * the <code>AclConfiguration</code> of <code>ResultConfigurationUpdates</code>, the <code>AclConfiguration</code>
     * in the workgroup's <code>ResultConfiguration</code> is updated with the new value. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @return If set to <code>true</code>, indicates that the previously-specified ACL configuration for queries in
     *         this workgroup should be ignored and set to null. If set to <code>false</code> or not set, and a value is
     *         present in the <code>AclConfiguration</code> of <code>ResultConfigurationUpdates</code>, the
     *         <code>AclConfiguration</code> in the workgroup's <code>ResultConfiguration</code> is updated with the new
     *         value. For more information, see <a
     *         href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *         Override Client-Side Settings</a>.
     */

    public Boolean getRemoveAclConfiguration() {
        return this.removeAclConfiguration;
    }

    /**
     * <p>
     * If set to <code>true</code>, indicates that the previously-specified ACL configuration for queries in this
     * workgroup should be ignored and set to null. If set to <code>false</code> or not set, and a value is present in
     * the <code>AclConfiguration</code> of <code>ResultConfigurationUpdates</code>, the <code>AclConfiguration</code>
     * in the workgroup's <code>ResultConfiguration</code> is updated with the new value. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @param removeAclConfiguration
     *        If set to <code>true</code>, indicates that the previously-specified ACL configuration for queries in this
     *        workgroup should be ignored and set to null. If set to <code>false</code> or not set, and a value is
     *        present in the <code>AclConfiguration</code> of <code>ResultConfigurationUpdates</code>, the
     *        <code>AclConfiguration</code> in the workgroup's <code>ResultConfiguration</code> is updated with the new
     *        value. For more information, see <a
     *        href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *        Override Client-Side Settings</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultConfigurationUpdates withRemoveAclConfiguration(Boolean removeAclConfiguration) {
        setRemoveAclConfiguration(removeAclConfiguration);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, indicates that the previously-specified ACL configuration for queries in this
     * workgroup should be ignored and set to null. If set to <code>false</code> or not set, and a value is present in
     * the <code>AclConfiguration</code> of <code>ResultConfigurationUpdates</code>, the <code>AclConfiguration</code>
     * in the workgroup's <code>ResultConfiguration</code> is updated with the new value. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings Override
     * Client-Side Settings</a>.
     * </p>
     * 
     * @return If set to <code>true</code>, indicates that the previously-specified ACL configuration for queries in
     *         this workgroup should be ignored and set to null. If set to <code>false</code> or not set, and a value is
     *         present in the <code>AclConfiguration</code> of <code>ResultConfigurationUpdates</code>, the
     *         <code>AclConfiguration</code> in the workgroup's <code>ResultConfiguration</code> is updated with the new
     *         value. For more information, see <a
     *         href="https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html">Workgroup Settings
     *         Override Client-Side Settings</a>.
     */

    public Boolean isRemoveAclConfiguration() {
        return this.removeAclConfiguration;
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
            sb.append("RemoveEncryptionConfiguration: ").append(getRemoveEncryptionConfiguration()).append(",");
        if (getExpectedBucketOwner() != null)
            sb.append("ExpectedBucketOwner: ").append(getExpectedBucketOwner()).append(",");
        if (getRemoveExpectedBucketOwner() != null)
            sb.append("RemoveExpectedBucketOwner: ").append(getRemoveExpectedBucketOwner()).append(",");
        if (getAclConfiguration() != null)
            sb.append("AclConfiguration: ").append(getAclConfiguration()).append(",");
        if (getRemoveAclConfiguration() != null)
            sb.append("RemoveAclConfiguration: ").append(getRemoveAclConfiguration());
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
        if (other.getExpectedBucketOwner() == null ^ this.getExpectedBucketOwner() == null)
            return false;
        if (other.getExpectedBucketOwner() != null && other.getExpectedBucketOwner().equals(this.getExpectedBucketOwner()) == false)
            return false;
        if (other.getRemoveExpectedBucketOwner() == null ^ this.getRemoveExpectedBucketOwner() == null)
            return false;
        if (other.getRemoveExpectedBucketOwner() != null && other.getRemoveExpectedBucketOwner().equals(this.getRemoveExpectedBucketOwner()) == false)
            return false;
        if (other.getAclConfiguration() == null ^ this.getAclConfiguration() == null)
            return false;
        if (other.getAclConfiguration() != null && other.getAclConfiguration().equals(this.getAclConfiguration()) == false)
            return false;
        if (other.getRemoveAclConfiguration() == null ^ this.getRemoveAclConfiguration() == null)
            return false;
        if (other.getRemoveAclConfiguration() != null && other.getRemoveAclConfiguration().equals(this.getRemoveAclConfiguration()) == false)
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
        hashCode = prime * hashCode + ((getExpectedBucketOwner() == null) ? 0 : getExpectedBucketOwner().hashCode());
        hashCode = prime * hashCode + ((getRemoveExpectedBucketOwner() == null) ? 0 : getRemoveExpectedBucketOwner().hashCode());
        hashCode = prime * hashCode + ((getAclConfiguration() == null) ? 0 : getAclConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRemoveAclConfiguration() == null) ? 0 : getRemoveAclConfiguration().hashCode());
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
