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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateDevEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDevEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name to be assigned to the new DevEndpoint.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The IAM role for the DevEndpoint.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Security group IDs for the security groups to be used by the new DevEndpoint.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The subnet ID for the new DevEndpoint to use.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The public key to be used by this DevEndpoint for authentication. This attribute is provided for backward
     * compatibility, as the recommended attribute to use is public keys.
     * </p>
     */
    private String publicKey;
    /**
     * <p>
     * A list of public keys to be used by the DevEndpoints for authentication. The use of this attribute is preferred
     * over a single public key because the public keys allow you to have a different private key per client.
     * </p>
     * <note>
     * <p>
     * If you previously created an endpoint with a public key, you must remove that key to be able to set a list of
     * public keys: call the <code>UpdateDevEndpoint</code> API with the public key content in the
     * <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code> attribute.
     * </p>
     * </note>
     */
    private java.util.List<String> publicKeys;
    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) to allocate to this DevEndpoint.
     * </p>
     */
    private Integer numberOfNodes;
    /**
     * <p>
     * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint. Multiple
     * values must be complete paths separated by a comma.
     * </p>
     * <p>
     * Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on C
     * extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are not yet
     * supported.
     * </p>
     */
    private String extraPythonLibsS3Path;
    /**
     * <p>
     * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     * </p>
     */
    private String extraJarsS3Path;
    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with this DevEndpoint.
     * </p>
     */
    private String securityConfiguration;
    /**
     * <p>
     * The tags to use with this DevEndpoint. You may use tags to limit access to the DevEndpoint. For more information
     * about tags in AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS
     * Glue</a> in the developer guide.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A map of arguments used to configure the DevEndpoint.
     * </p>
     */
    private java.util.Map<String, String> arguments;

    /**
     * <p>
     * The name to be assigned to the new DevEndpoint.
     * </p>
     * 
     * @param endpointName
     *        The name to be assigned to the new DevEndpoint.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name to be assigned to the new DevEndpoint.
     * </p>
     * 
     * @return The name to be assigned to the new DevEndpoint.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name to be assigned to the new DevEndpoint.
     * </p>
     * 
     * @param endpointName
     *        The name to be assigned to the new DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The IAM role for the DevEndpoint.
     * </p>
     * 
     * @param roleArn
     *        The IAM role for the DevEndpoint.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role for the DevEndpoint.
     * </p>
     * 
     * @return The IAM role for the DevEndpoint.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM role for the DevEndpoint.
     * </p>
     * 
     * @param roleArn
     *        The IAM role for the DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Security group IDs for the security groups to be used by the new DevEndpoint.
     * </p>
     * 
     * @return Security group IDs for the security groups to be used by the new DevEndpoint.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * Security group IDs for the security groups to be used by the new DevEndpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        Security group IDs for the security groups to be used by the new DevEndpoint.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * Security group IDs for the security groups to be used by the new DevEndpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        Security group IDs for the security groups to be used by the new DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Security group IDs for the security groups to be used by the new DevEndpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        Security group IDs for the security groups to be used by the new DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The subnet ID for the new DevEndpoint to use.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID for the new DevEndpoint to use.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The subnet ID for the new DevEndpoint to use.
     * </p>
     * 
     * @return The subnet ID for the new DevEndpoint to use.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The subnet ID for the new DevEndpoint to use.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID for the new DevEndpoint to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The public key to be used by this DevEndpoint for authentication. This attribute is provided for backward
     * compatibility, as the recommended attribute to use is public keys.
     * </p>
     * 
     * @param publicKey
     *        The public key to be used by this DevEndpoint for authentication. This attribute is provided for backward
     *        compatibility, as the recommended attribute to use is public keys.
     */

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * The public key to be used by this DevEndpoint for authentication. This attribute is provided for backward
     * compatibility, as the recommended attribute to use is public keys.
     * </p>
     * 
     * @return The public key to be used by this DevEndpoint for authentication. This attribute is provided for backward
     *         compatibility, as the recommended attribute to use is public keys.
     */

    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * <p>
     * The public key to be used by this DevEndpoint for authentication. This attribute is provided for backward
     * compatibility, as the recommended attribute to use is public keys.
     * </p>
     * 
     * @param publicKey
     *        The public key to be used by this DevEndpoint for authentication. This attribute is provided for backward
     *        compatibility, as the recommended attribute to use is public keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withPublicKey(String publicKey) {
        setPublicKey(publicKey);
        return this;
    }

    /**
     * <p>
     * A list of public keys to be used by the DevEndpoints for authentication. The use of this attribute is preferred
     * over a single public key because the public keys allow you to have a different private key per client.
     * </p>
     * <note>
     * <p>
     * If you previously created an endpoint with a public key, you must remove that key to be able to set a list of
     * public keys: call the <code>UpdateDevEndpoint</code> API with the public key content in the
     * <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code> attribute.
     * </p>
     * </note>
     * 
     * @return A list of public keys to be used by the DevEndpoints for authentication. The use of this attribute is
     *         preferred over a single public key because the public keys allow you to have a different private key per
     *         client.</p> <note>
     *         <p>
     *         If you previously created an endpoint with a public key, you must remove that key to be able to set a
     *         list of public keys: call the <code>UpdateDevEndpoint</code> API with the public key content in the
     *         <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code>
     *         attribute.
     *         </p>
     */

    public java.util.List<String> getPublicKeys() {
        return publicKeys;
    }

    /**
     * <p>
     * A list of public keys to be used by the DevEndpoints for authentication. The use of this attribute is preferred
     * over a single public key because the public keys allow you to have a different private key per client.
     * </p>
     * <note>
     * <p>
     * If you previously created an endpoint with a public key, you must remove that key to be able to set a list of
     * public keys: call the <code>UpdateDevEndpoint</code> API with the public key content in the
     * <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code> attribute.
     * </p>
     * </note>
     * 
     * @param publicKeys
     *        A list of public keys to be used by the DevEndpoints for authentication. The use of this attribute is
     *        preferred over a single public key because the public keys allow you to have a different private key per
     *        client.</p> <note>
     *        <p>
     *        If you previously created an endpoint with a public key, you must remove that key to be able to set a list
     *        of public keys: call the <code>UpdateDevEndpoint</code> API with the public key content in the
     *        <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code>
     *        attribute.
     *        </p>
     */

    public void setPublicKeys(java.util.Collection<String> publicKeys) {
        if (publicKeys == null) {
            this.publicKeys = null;
            return;
        }

        this.publicKeys = new java.util.ArrayList<String>(publicKeys);
    }

    /**
     * <p>
     * A list of public keys to be used by the DevEndpoints for authentication. The use of this attribute is preferred
     * over a single public key because the public keys allow you to have a different private key per client.
     * </p>
     * <note>
     * <p>
     * If you previously created an endpoint with a public key, you must remove that key to be able to set a list of
     * public keys: call the <code>UpdateDevEndpoint</code> API with the public key content in the
     * <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code> attribute.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPublicKeys(java.util.Collection)} or {@link #withPublicKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param publicKeys
     *        A list of public keys to be used by the DevEndpoints for authentication. The use of this attribute is
     *        preferred over a single public key because the public keys allow you to have a different private key per
     *        client.</p> <note>
     *        <p>
     *        If you previously created an endpoint with a public key, you must remove that key to be able to set a list
     *        of public keys: call the <code>UpdateDevEndpoint</code> API with the public key content in the
     *        <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code>
     *        attribute.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withPublicKeys(String... publicKeys) {
        if (this.publicKeys == null) {
            setPublicKeys(new java.util.ArrayList<String>(publicKeys.length));
        }
        for (String ele : publicKeys) {
            this.publicKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of public keys to be used by the DevEndpoints for authentication. The use of this attribute is preferred
     * over a single public key because the public keys allow you to have a different private key per client.
     * </p>
     * <note>
     * <p>
     * If you previously created an endpoint with a public key, you must remove that key to be able to set a list of
     * public keys: call the <code>UpdateDevEndpoint</code> API with the public key content in the
     * <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code> attribute.
     * </p>
     * </note>
     * 
     * @param publicKeys
     *        A list of public keys to be used by the DevEndpoints for authentication. The use of this attribute is
     *        preferred over a single public key because the public keys allow you to have a different private key per
     *        client.</p> <note>
     *        <p>
     *        If you previously created an endpoint with a public key, you must remove that key to be able to set a list
     *        of public keys: call the <code>UpdateDevEndpoint</code> API with the public key content in the
     *        <code>deletePublicKeys</code> attribute, and the list of new keys in the <code>addPublicKeys</code>
     *        attribute.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withPublicKeys(java.util.Collection<String> publicKeys) {
        setPublicKeys(publicKeys);
        return this;
    }

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) to allocate to this DevEndpoint.
     * </p>
     * 
     * @param numberOfNodes
     *        The number of AWS Glue Data Processing Units (DPUs) to allocate to this DevEndpoint.
     */

    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) to allocate to this DevEndpoint.
     * </p>
     * 
     * @return The number of AWS Glue Data Processing Units (DPUs) to allocate to this DevEndpoint.
     */

    public Integer getNumberOfNodes() {
        return this.numberOfNodes;
    }

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) to allocate to this DevEndpoint.
     * </p>
     * 
     * @param numberOfNodes
     *        The number of AWS Glue Data Processing Units (DPUs) to allocate to this DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withNumberOfNodes(Integer numberOfNodes) {
        setNumberOfNodes(numberOfNodes);
        return this;
    }

    /**
     * <p>
     * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint. Multiple
     * values must be complete paths separated by a comma.
     * </p>
     * <p>
     * Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on C
     * extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are not yet
     * supported.
     * </p>
     * 
     * @param extraPythonLibsS3Path
     *        Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint.
     *        Multiple values must be complete paths separated by a comma.</p>
     *        <p>
     *        Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on
     *        C extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are
     *        not yet supported.
     */

    public void setExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        this.extraPythonLibsS3Path = extraPythonLibsS3Path;
    }

    /**
     * <p>
     * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint. Multiple
     * values must be complete paths separated by a comma.
     * </p>
     * <p>
     * Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on C
     * extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are not yet
     * supported.
     * </p>
     * 
     * @return Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint.
     *         Multiple values must be complete paths separated by a comma.</p>
     *         <p>
     *         Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely
     *         on C extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library,
     *         are not yet supported.
     */

    public String getExtraPythonLibsS3Path() {
        return this.extraPythonLibsS3Path;
    }

    /**
     * <p>
     * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint. Multiple
     * values must be complete paths separated by a comma.
     * </p>
     * <p>
     * Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on C
     * extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are not yet
     * supported.
     * </p>
     * 
     * @param extraPythonLibsS3Path
     *        Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint.
     *        Multiple values must be complete paths separated by a comma.</p>
     *        <p>
     *        Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on
     *        C extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are
     *        not yet supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        setExtraPythonLibsS3Path(extraPythonLibsS3Path);
        return this;
    }

    /**
     * <p>
     * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     * </p>
     * 
     * @param extraJarsS3Path
     *        Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     */

    public void setExtraJarsS3Path(String extraJarsS3Path) {
        this.extraJarsS3Path = extraJarsS3Path;
    }

    /**
     * <p>
     * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     * </p>
     * 
     * @return Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     */

    public String getExtraJarsS3Path() {
        return this.extraJarsS3Path;
    }

    /**
     * <p>
     * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     * </p>
     * 
     * @param extraJarsS3Path
     *        Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withExtraJarsS3Path(String extraJarsS3Path) {
        setExtraJarsS3Path(extraJarsS3Path);
        return this;
    }

    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with this DevEndpoint.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the SecurityConfiguration structure to be used with this DevEndpoint.
     */

    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with this DevEndpoint.
     * </p>
     * 
     * @return The name of the SecurityConfiguration structure to be used with this DevEndpoint.
     */

    public String getSecurityConfiguration() {
        return this.securityConfiguration;
    }

    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with this DevEndpoint.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the SecurityConfiguration structure to be used with this DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withSecurityConfiguration(String securityConfiguration) {
        setSecurityConfiguration(securityConfiguration);
        return this;
    }

    /**
     * <p>
     * The tags to use with this DevEndpoint. You may use tags to limit access to the DevEndpoint. For more information
     * about tags in AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS
     * Glue</a> in the developer guide.
     * </p>
     * 
     * @return The tags to use with this DevEndpoint. You may use tags to limit access to the DevEndpoint. For more
     *         information about tags in AWS Glue, see <a
     *         href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS Glue</a> in the
     *         developer guide.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to use with this DevEndpoint. You may use tags to limit access to the DevEndpoint. For more information
     * about tags in AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS
     * Glue</a> in the developer guide.
     * </p>
     * 
     * @param tags
     *        The tags to use with this DevEndpoint. You may use tags to limit access to the DevEndpoint. For more
     *        information about tags in AWS Glue, see <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS Glue</a> in the
     *        developer guide.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to use with this DevEndpoint. You may use tags to limit access to the DevEndpoint. For more information
     * about tags in AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS
     * Glue</a> in the developer guide.
     * </p>
     * 
     * @param tags
     *        The tags to use with this DevEndpoint. You may use tags to limit access to the DevEndpoint. For more
     *        information about tags in AWS Glue, see <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS Glue</a> in the
     *        developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreateDevEndpointRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A map of arguments used to configure the DevEndpoint.
     * </p>
     * 
     * @return A map of arguments used to configure the DevEndpoint.
     */

    public java.util.Map<String, String> getArguments() {
        return arguments;
    }

    /**
     * <p>
     * A map of arguments used to configure the DevEndpoint.
     * </p>
     * 
     * @param arguments
     *        A map of arguments used to configure the DevEndpoint.
     */

    public void setArguments(java.util.Map<String, String> arguments) {
        this.arguments = arguments;
    }

    /**
     * <p>
     * A map of arguments used to configure the DevEndpoint.
     * </p>
     * 
     * @param arguments
     *        A map of arguments used to configure the DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withArguments(java.util.Map<String, String> arguments) {
        setArguments(arguments);
        return this;
    }

    public CreateDevEndpointRequest addArgumentsEntry(String key, String value) {
        if (null == this.arguments) {
            this.arguments = new java.util.HashMap<String, String>();
        }
        if (this.arguments.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.arguments.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Arguments.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest clearArgumentsEntries() {
        this.arguments = null;
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
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getPublicKey() != null)
            sb.append("PublicKey: ").append(getPublicKey()).append(",");
        if (getPublicKeys() != null)
            sb.append("PublicKeys: ").append(getPublicKeys()).append(",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: ").append(getNumberOfNodes()).append(",");
        if (getExtraPythonLibsS3Path() != null)
            sb.append("ExtraPythonLibsS3Path: ").append(getExtraPythonLibsS3Path()).append(",");
        if (getExtraJarsS3Path() != null)
            sb.append("ExtraJarsS3Path: ").append(getExtraJarsS3Path()).append(",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: ").append(getSecurityConfiguration()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getArguments() != null)
            sb.append("Arguments: ").append(getArguments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDevEndpointRequest == false)
            return false;
        CreateDevEndpointRequest other = (CreateDevEndpointRequest) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        if (other.getPublicKeys() == null ^ this.getPublicKeys() == null)
            return false;
        if (other.getPublicKeys() != null && other.getPublicKeys().equals(this.getPublicKeys()) == false)
            return false;
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null)
            return false;
        if (other.getNumberOfNodes() != null && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false)
            return false;
        if (other.getExtraPythonLibsS3Path() == null ^ this.getExtraPythonLibsS3Path() == null)
            return false;
        if (other.getExtraPythonLibsS3Path() != null && other.getExtraPythonLibsS3Path().equals(this.getExtraPythonLibsS3Path()) == false)
            return false;
        if (other.getExtraJarsS3Path() == null ^ this.getExtraJarsS3Path() == null)
            return false;
        if (other.getExtraJarsS3Path() != null && other.getExtraJarsS3Path().equals(this.getExtraJarsS3Path()) == false)
            return false;
        if (other.getSecurityConfiguration() == null ^ this.getSecurityConfiguration() == null)
            return false;
        if (other.getSecurityConfiguration() != null && other.getSecurityConfiguration().equals(this.getSecurityConfiguration()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getArguments() == null ^ this.getArguments() == null)
            return false;
        if (other.getArguments() != null && other.getArguments().equals(this.getArguments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime * hashCode + ((getPublicKeys() == null) ? 0 : getPublicKeys().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime * hashCode + ((getExtraPythonLibsS3Path() == null) ? 0 : getExtraPythonLibsS3Path().hashCode());
        hashCode = prime * hashCode + ((getExtraJarsS3Path() == null) ? 0 : getExtraJarsS3Path().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getArguments() == null) ? 0 : getArguments().hashCode());
        return hashCode;
    }

    @Override
    public CreateDevEndpointRequest clone() {
        return (CreateDevEndpointRequest) super.clone();
    }

}
