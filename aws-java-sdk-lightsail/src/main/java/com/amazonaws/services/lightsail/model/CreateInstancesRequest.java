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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The names to use for your new Lightsail instances. Separate multiple values using quotation marks and commas, for
     * example: <code>["MyFirstInstance","MySecondInstance"]</code>
     * </p>
     */
    private java.util.List<String> instanceNames;
    /**
     * <p>
     * The Availability Zone in which to create your instance. Use the following format: <code>us-east-2a</code> (case
     * sensitive). You can get a list of Availability Zones by using the <a
     * href="http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html">get regions</a>
     * operation. Be sure to add the <code>include Availability Zones</code> parameter to your request.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * (Deprecated) The name for your custom image.
     * </p>
     * <note>
     * <p>
     * In releases prior to June 12, 2017, this parameter was ignored by the API. It is now deprecated.
     * </p>
     * </note>
     */
    @Deprecated
    private String customImageName;
    /**
     * <p>
     * The ID for a virtual private server image (e.g., <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>).
     * Use the get blueprints operation to return a list of available images (or <i>blueprints</i>).
     * </p>
     */
    private String blueprintId;
    /**
     * <p>
     * The bundle of specification information for your virtual private server (or <i>instance</i>), including the
     * pricing plan (e.g., <code>micro_1_0</code>).
     * </p>
     */
    private String bundleId;
    /**
     * <p>
     * A launch script you can create that configures a server with additional user data. For example, you might want to
     * run <code>apt-get -y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and
     * CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses <code>pkg</code>. For a
     * complete list, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/getting-started/article/compare-options-choose-lightsail-instance-image"
     * >Dev Guide</a>.
     * </p>
     * </note>
     */
    private String userData;
    /**
     * <p>
     * The name of your key pair.
     * </p>
     */
    private String keyPairName;
    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The names to use for your new Lightsail instances. Separate multiple values using quotation marks and commas, for
     * example: <code>["MyFirstInstance","MySecondInstance"]</code>
     * </p>
     * 
     * @return The names to use for your new Lightsail instances. Separate multiple values using quotation marks and
     *         commas, for example: <code>["MyFirstInstance","MySecondInstance"]</code>
     */

    public java.util.List<String> getInstanceNames() {
        return instanceNames;
    }

    /**
     * <p>
     * The names to use for your new Lightsail instances. Separate multiple values using quotation marks and commas, for
     * example: <code>["MyFirstInstance","MySecondInstance"]</code>
     * </p>
     * 
     * @param instanceNames
     *        The names to use for your new Lightsail instances. Separate multiple values using quotation marks and
     *        commas, for example: <code>["MyFirstInstance","MySecondInstance"]</code>
     */

    public void setInstanceNames(java.util.Collection<String> instanceNames) {
        if (instanceNames == null) {
            this.instanceNames = null;
            return;
        }

        this.instanceNames = new java.util.ArrayList<String>(instanceNames);
    }

    /**
     * <p>
     * The names to use for your new Lightsail instances. Separate multiple values using quotation marks and commas, for
     * example: <code>["MyFirstInstance","MySecondInstance"]</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceNames(java.util.Collection)} or {@link #withInstanceNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceNames
     *        The names to use for your new Lightsail instances. Separate multiple values using quotation marks and
     *        commas, for example: <code>["MyFirstInstance","MySecondInstance"]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesRequest withInstanceNames(String... instanceNames) {
        if (this.instanceNames == null) {
            setInstanceNames(new java.util.ArrayList<String>(instanceNames.length));
        }
        for (String ele : instanceNames) {
            this.instanceNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names to use for your new Lightsail instances. Separate multiple values using quotation marks and commas, for
     * example: <code>["MyFirstInstance","MySecondInstance"]</code>
     * </p>
     * 
     * @param instanceNames
     *        The names to use for your new Lightsail instances. Separate multiple values using quotation marks and
     *        commas, for example: <code>["MyFirstInstance","MySecondInstance"]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesRequest withInstanceNames(java.util.Collection<String> instanceNames) {
        setInstanceNames(instanceNames);
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which to create your instance. Use the following format: <code>us-east-2a</code> (case
     * sensitive). You can get a list of Availability Zones by using the <a
     * href="http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html">get regions</a>
     * operation. Be sure to add the <code>include Availability Zones</code> parameter to your request.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which to create your instance. Use the following format: <code>us-east-2a</code>
     *        (case sensitive). You can get a list of Availability Zones by using the <a
     *        href="http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html">get regions</a>
     *        operation. Be sure to add the <code>include Availability Zones</code> parameter to your request.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to create your instance. Use the following format: <code>us-east-2a</code> (case
     * sensitive). You can get a list of Availability Zones by using the <a
     * href="http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html">get regions</a>
     * operation. Be sure to add the <code>include Availability Zones</code> parameter to your request.
     * </p>
     * 
     * @return The Availability Zone in which to create your instance. Use the following format: <code>us-east-2a</code>
     *         (case sensitive). You can get a list of Availability Zones by using the <a
     *         href="http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html">get regions</a>
     *         operation. Be sure to add the <code>include Availability Zones</code> parameter to your request.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to create your instance. Use the following format: <code>us-east-2a</code> (case
     * sensitive). You can get a list of Availability Zones by using the <a
     * href="http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html">get regions</a>
     * operation. Be sure to add the <code>include Availability Zones</code> parameter to your request.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which to create your instance. Use the following format: <code>us-east-2a</code>
     *        (case sensitive). You can get a list of Availability Zones by using the <a
     *        href="http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_GetRegions.html">get regions</a>
     *        operation. Be sure to add the <code>include Availability Zones</code> parameter to your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * (Deprecated) The name for your custom image.
     * </p>
     * <note>
     * <p>
     * In releases prior to June 12, 2017, this parameter was ignored by the API. It is now deprecated.
     * </p>
     * </note>
     * 
     * @param customImageName
     *        (Deprecated) The name for your custom image.</p> <note>
     *        <p>
     *        In releases prior to June 12, 2017, this parameter was ignored by the API. It is now deprecated.
     *        </p>
     */
    @Deprecated
    public void setCustomImageName(String customImageName) {
        this.customImageName = customImageName;
    }

    /**
     * <p>
     * (Deprecated) The name for your custom image.
     * </p>
     * <note>
     * <p>
     * In releases prior to June 12, 2017, this parameter was ignored by the API. It is now deprecated.
     * </p>
     * </note>
     * 
     * @return (Deprecated) The name for your custom image.</p> <note>
     *         <p>
     *         In releases prior to June 12, 2017, this parameter was ignored by the API. It is now deprecated.
     *         </p>
     */
    @Deprecated
    public String getCustomImageName() {
        return this.customImageName;
    }

    /**
     * <p>
     * (Deprecated) The name for your custom image.
     * </p>
     * <note>
     * <p>
     * In releases prior to June 12, 2017, this parameter was ignored by the API. It is now deprecated.
     * </p>
     * </note>
     * 
     * @param customImageName
     *        (Deprecated) The name for your custom image.</p> <note>
     *        <p>
     *        In releases prior to June 12, 2017, this parameter was ignored by the API. It is now deprecated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public CreateInstancesRequest withCustomImageName(String customImageName) {
        setCustomImageName(customImageName);
        return this;
    }

    /**
     * <p>
     * The ID for a virtual private server image (e.g., <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>).
     * Use the get blueprints operation to return a list of available images (or <i>blueprints</i>).
     * </p>
     * 
     * @param blueprintId
     *        The ID for a virtual private server image (e.g., <code>app_wordpress_4_4</code> or
     *        <code>app_lamp_7_0</code>). Use the get blueprints operation to return a list of available images (or
     *        <i>blueprints</i>).
     */

    public void setBlueprintId(String blueprintId) {
        this.blueprintId = blueprintId;
    }

    /**
     * <p>
     * The ID for a virtual private server image (e.g., <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>).
     * Use the get blueprints operation to return a list of available images (or <i>blueprints</i>).
     * </p>
     * 
     * @return The ID for a virtual private server image (e.g., <code>app_wordpress_4_4</code> or
     *         <code>app_lamp_7_0</code>). Use the get blueprints operation to return a list of available images (or
     *         <i>blueprints</i>).
     */

    public String getBlueprintId() {
        return this.blueprintId;
    }

    /**
     * <p>
     * The ID for a virtual private server image (e.g., <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>).
     * Use the get blueprints operation to return a list of available images (or <i>blueprints</i>).
     * </p>
     * 
     * @param blueprintId
     *        The ID for a virtual private server image (e.g., <code>app_wordpress_4_4</code> or
     *        <code>app_lamp_7_0</code>). Use the get blueprints operation to return a list of available images (or
     *        <i>blueprints</i>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesRequest withBlueprintId(String blueprintId) {
        setBlueprintId(blueprintId);
        return this;
    }

    /**
     * <p>
     * The bundle of specification information for your virtual private server (or <i>instance</i>), including the
     * pricing plan (e.g., <code>micro_1_0</code>).
     * </p>
     * 
     * @param bundleId
     *        The bundle of specification information for your virtual private server (or <i>instance</i>), including
     *        the pricing plan (e.g., <code>micro_1_0</code>).
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The bundle of specification information for your virtual private server (or <i>instance</i>), including the
     * pricing plan (e.g., <code>micro_1_0</code>).
     * </p>
     * 
     * @return The bundle of specification information for your virtual private server (or <i>instance</i>), including
     *         the pricing plan (e.g., <code>micro_1_0</code>).
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The bundle of specification information for your virtual private server (or <i>instance</i>), including the
     * pricing plan (e.g., <code>micro_1_0</code>).
     * </p>
     * 
     * @param bundleId
     *        The bundle of specification information for your virtual private server (or <i>instance</i>), including
     *        the pricing plan (e.g., <code>micro_1_0</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesRequest withBundleId(String bundleId) {
        setBundleId(bundleId);
        return this;
    }

    /**
     * <p>
     * A launch script you can create that configures a server with additional user data. For example, you might want to
     * run <code>apt-get -y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and
     * CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses <code>pkg</code>. For a
     * complete list, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/getting-started/article/compare-options-choose-lightsail-instance-image"
     * >Dev Guide</a>.
     * </p>
     * </note>
     * 
     * @param userData
     *        A launch script you can create that configures a server with additional user data. For example, you might
     *        want to run <code>apt-get -y update</code>.</p> <note>
     *        <p>
     *        Depending on the machine image you choose, the command to get software on your instance varies. Amazon
     *        Linux and CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses
     *        <code>pkg</code>. For a complete list, see the <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/getting-started/article/compare-options-choose-lightsail-instance-image"
     *        >Dev Guide</a>.
     *        </p>
     */

    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * A launch script you can create that configures a server with additional user data. For example, you might want to
     * run <code>apt-get -y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and
     * CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses <code>pkg</code>. For a
     * complete list, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/getting-started/article/compare-options-choose-lightsail-instance-image"
     * >Dev Guide</a>.
     * </p>
     * </note>
     * 
     * @return A launch script you can create that configures a server with additional user data. For example, you might
     *         want to run <code>apt-get -y update</code>.</p> <note>
     *         <p>
     *         Depending on the machine image you choose, the command to get software on your instance varies. Amazon
     *         Linux and CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses
     *         <code>pkg</code>. For a complete list, see the <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/getting-started/article/compare-options-choose-lightsail-instance-image"
     *         >Dev Guide</a>.
     *         </p>
     */

    public String getUserData() {
        return this.userData;
    }

    /**
     * <p>
     * A launch script you can create that configures a server with additional user data. For example, you might want to
     * run <code>apt-get -y update</code>.
     * </p>
     * <note>
     * <p>
     * Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and
     * CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses <code>pkg</code>. For a
     * complete list, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/getting-started/article/compare-options-choose-lightsail-instance-image"
     * >Dev Guide</a>.
     * </p>
     * </note>
     * 
     * @param userData
     *        A launch script you can create that configures a server with additional user data. For example, you might
     *        want to run <code>apt-get -y update</code>.</p> <note>
     *        <p>
     *        Depending on the machine image you choose, the command to get software on your instance varies. Amazon
     *        Linux and CentOS use <code>yum</code>, Debian and Ubuntu use <code>apt-get</code>, and FreeBSD uses
     *        <code>pkg</code>. For a complete list, see the <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/getting-started/article/compare-options-choose-lightsail-instance-image"
     *        >Dev Guide</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesRequest withUserData(String userData) {
        setUserData(userData);
        return this;
    }

    /**
     * <p>
     * The name of your key pair.
     * </p>
     * 
     * @param keyPairName
     *        The name of your key pair.
     */

    public void setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
    }

    /**
     * <p>
     * The name of your key pair.
     * </p>
     * 
     * @return The name of your key pair.
     */

    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * <p>
     * The name of your key pair.
     * </p>
     * 
     * @param keyPairName
     *        The name of your key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesRequest withKeyPairName(String keyPairName) {
        setKeyPairName(keyPairName);
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * 
     * @return The tag keys and optional values to add to the resource during create.</p>
     *         <p>
     *         To tag a resource after it has been created, see the <code>tag resource</code> operation.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        To tag a resource after it has been created, see the <code>tag resource</code> operation.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstancesRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getInstanceNames() != null)
            sb.append("InstanceNames: ").append(getInstanceNames()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getCustomImageName() != null)
            sb.append("CustomImageName: ").append(getCustomImageName()).append(",");
        if (getBlueprintId() != null)
            sb.append("BlueprintId: ").append(getBlueprintId()).append(",");
        if (getBundleId() != null)
            sb.append("BundleId: ").append(getBundleId()).append(",");
        if (getUserData() != null)
            sb.append("UserData: ").append(getUserData()).append(",");
        if (getKeyPairName() != null)
            sb.append("KeyPairName: ").append(getKeyPairName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInstancesRequest == false)
            return false;
        CreateInstancesRequest other = (CreateInstancesRequest) obj;
        if (other.getInstanceNames() == null ^ this.getInstanceNames() == null)
            return false;
        if (other.getInstanceNames() != null && other.getInstanceNames().equals(this.getInstanceNames()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getCustomImageName() == null ^ this.getCustomImageName() == null)
            return false;
        if (other.getCustomImageName() != null && other.getCustomImageName().equals(this.getCustomImageName()) == false)
            return false;
        if (other.getBlueprintId() == null ^ this.getBlueprintId() == null)
            return false;
        if (other.getBlueprintId() != null && other.getBlueprintId().equals(this.getBlueprintId()) == false)
            return false;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        if (other.getKeyPairName() == null ^ this.getKeyPairName() == null)
            return false;
        if (other.getKeyPairName() != null && other.getKeyPairName().equals(this.getKeyPairName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceNames() == null) ? 0 : getInstanceNames().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getCustomImageName() == null) ? 0 : getCustomImageName().hashCode());
        hashCode = prime * hashCode + ((getBlueprintId() == null) ? 0 : getBlueprintId().hashCode());
        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode + ((getKeyPairName() == null) ? 0 : getKeyPairName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateInstancesRequest clone() {
        return (CreateInstancesRequest) super.clone();
    }

}
