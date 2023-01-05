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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDatalake" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatalakeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify the Region or Regions that will contribute data to the rollup region.
     * </p>
     */
    private java.util.Map<String, LakeConfigurationRequest> configurations;
    /**
     * <p>
     * Enable Security Lake in all Regions.
     * </p>
     */
    private Boolean enableAll;
    /**
     * <p>
     * The Amazon Resource Name (ARN) used to create and update the Glue table. This table contains partitions generated
     * by the ingestion and normalization of Amazon Web Services log sources and custom sources.
     * </p>
     */
    private String metaStoreManagerRoleArn;
    /**
     * <p>
     * Enable Security Lake in the specified Regions. To enable Security Lake in specific Amazon Web Services Regions,
     * such as us-east-1 or ap-northeast-3, provide the Region codes. For a list of Region codes, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/securitylake.html">Amazon Security Lake endpoints</a> in the
     * Amazon Web Services General Reference.
     * </p>
     */
    private java.util.List<String> regions;

    /**
     * <p>
     * Specify the Region or Regions that will contribute data to the rollup region.
     * </p>
     * 
     * @return Specify the Region or Regions that will contribute data to the rollup region.
     */

    public java.util.Map<String, LakeConfigurationRequest> getConfigurations() {
        return configurations;
    }

    /**
     * <p>
     * Specify the Region or Regions that will contribute data to the rollup region.
     * </p>
     * 
     * @param configurations
     *        Specify the Region or Regions that will contribute data to the rollup region.
     */

    public void setConfigurations(java.util.Map<String, LakeConfigurationRequest> configurations) {
        this.configurations = configurations;
    }

    /**
     * <p>
     * Specify the Region or Regions that will contribute data to the rollup region.
     * </p>
     * 
     * @param configurations
     *        Specify the Region or Regions that will contribute data to the rollup region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatalakeRequest withConfigurations(java.util.Map<String, LakeConfigurationRequest> configurations) {
        setConfigurations(configurations);
        return this;
    }

    /**
     * Add a single Configurations entry
     *
     * @see CreateDatalakeRequest#withConfigurations
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatalakeRequest addConfigurationsEntry(String key, LakeConfigurationRequest value) {
        if (null == this.configurations) {
            this.configurations = new java.util.HashMap<String, LakeConfigurationRequest>();
        }
        if (this.configurations.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.configurations.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Configurations.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatalakeRequest clearConfigurationsEntries() {
        this.configurations = null;
        return this;
    }

    /**
     * <p>
     * Enable Security Lake in all Regions.
     * </p>
     * 
     * @param enableAll
     *        Enable Security Lake in all Regions.
     */

    public void setEnableAll(Boolean enableAll) {
        this.enableAll = enableAll;
    }

    /**
     * <p>
     * Enable Security Lake in all Regions.
     * </p>
     * 
     * @return Enable Security Lake in all Regions.
     */

    public Boolean getEnableAll() {
        return this.enableAll;
    }

    /**
     * <p>
     * Enable Security Lake in all Regions.
     * </p>
     * 
     * @param enableAll
     *        Enable Security Lake in all Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatalakeRequest withEnableAll(Boolean enableAll) {
        setEnableAll(enableAll);
        return this;
    }

    /**
     * <p>
     * Enable Security Lake in all Regions.
     * </p>
     * 
     * @return Enable Security Lake in all Regions.
     */

    public Boolean isEnableAll() {
        return this.enableAll;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used to create and update the Glue table. This table contains partitions generated
     * by the ingestion and normalization of Amazon Web Services log sources and custom sources.
     * </p>
     * 
     * @param metaStoreManagerRoleArn
     *        The Amazon Resource Name (ARN) used to create and update the Glue table. This table contains partitions
     *        generated by the ingestion and normalization of Amazon Web Services log sources and custom sources.
     */

    public void setMetaStoreManagerRoleArn(String metaStoreManagerRoleArn) {
        this.metaStoreManagerRoleArn = metaStoreManagerRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used to create and update the Glue table. This table contains partitions generated
     * by the ingestion and normalization of Amazon Web Services log sources and custom sources.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) used to create and update the Glue table. This table contains partitions
     *         generated by the ingestion and normalization of Amazon Web Services log sources and custom sources.
     */

    public String getMetaStoreManagerRoleArn() {
        return this.metaStoreManagerRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used to create and update the Glue table. This table contains partitions generated
     * by the ingestion and normalization of Amazon Web Services log sources and custom sources.
     * </p>
     * 
     * @param metaStoreManagerRoleArn
     *        The Amazon Resource Name (ARN) used to create and update the Glue table. This table contains partitions
     *        generated by the ingestion and normalization of Amazon Web Services log sources and custom sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatalakeRequest withMetaStoreManagerRoleArn(String metaStoreManagerRoleArn) {
        setMetaStoreManagerRoleArn(metaStoreManagerRoleArn);
        return this;
    }

    /**
     * <p>
     * Enable Security Lake in the specified Regions. To enable Security Lake in specific Amazon Web Services Regions,
     * such as us-east-1 or ap-northeast-3, provide the Region codes. For a list of Region codes, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/securitylake.html">Amazon Security Lake endpoints</a> in the
     * Amazon Web Services General Reference.
     * </p>
     * 
     * @return Enable Security Lake in the specified Regions. To enable Security Lake in specific Amazon Web Services
     *         Regions, such as us-east-1 or ap-northeast-3, provide the Region codes. For a list of Region codes, see
     *         <a href="https://docs.aws.amazon.com/general/latest/gr/securitylake.html">Amazon Security Lake
     *         endpoints</a> in the Amazon Web Services General Reference.
     * @see Region
     */

    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * <p>
     * Enable Security Lake in the specified Regions. To enable Security Lake in specific Amazon Web Services Regions,
     * such as us-east-1 or ap-northeast-3, provide the Region codes. For a list of Region codes, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/securitylake.html">Amazon Security Lake endpoints</a> in the
     * Amazon Web Services General Reference.
     * </p>
     * 
     * @param regions
     *        Enable Security Lake in the specified Regions. To enable Security Lake in specific Amazon Web Services
     *        Regions, such as us-east-1 or ap-northeast-3, provide the Region codes. For a list of Region codes, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/securitylake.html">Amazon Security Lake endpoints</a>
     *        in the Amazon Web Services General Reference.
     * @see Region
     */

    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new java.util.ArrayList<String>(regions);
    }

    /**
     * <p>
     * Enable Security Lake in the specified Regions. To enable Security Lake in specific Amazon Web Services Regions,
     * such as us-east-1 or ap-northeast-3, provide the Region codes. For a list of Region codes, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/securitylake.html">Amazon Security Lake endpoints</a> in the
     * Amazon Web Services General Reference.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        Enable Security Lake in the specified Regions. To enable Security Lake in specific Amazon Web Services
     *        Regions, such as us-east-1 or ap-northeast-3, provide the Region codes. For a list of Region codes, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/securitylake.html">Amazon Security Lake endpoints</a>
     *        in the Amazon Web Services General Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Region
     */

    public CreateDatalakeRequest withRegions(String... regions) {
        if (this.regions == null) {
            setRegions(new java.util.ArrayList<String>(regions.length));
        }
        for (String ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Enable Security Lake in the specified Regions. To enable Security Lake in specific Amazon Web Services Regions,
     * such as us-east-1 or ap-northeast-3, provide the Region codes. For a list of Region codes, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/securitylake.html">Amazon Security Lake endpoints</a> in the
     * Amazon Web Services General Reference.
     * </p>
     * 
     * @param regions
     *        Enable Security Lake in the specified Regions. To enable Security Lake in specific Amazon Web Services
     *        Regions, such as us-east-1 or ap-northeast-3, provide the Region codes. For a list of Region codes, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/securitylake.html">Amazon Security Lake endpoints</a>
     *        in the Amazon Web Services General Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Region
     */

    public CreateDatalakeRequest withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * <p>
     * Enable Security Lake in the specified Regions. To enable Security Lake in specific Amazon Web Services Regions,
     * such as us-east-1 or ap-northeast-3, provide the Region codes. For a list of Region codes, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/securitylake.html">Amazon Security Lake endpoints</a> in the
     * Amazon Web Services General Reference.
     * </p>
     * 
     * @param regions
     *        Enable Security Lake in the specified Regions. To enable Security Lake in specific Amazon Web Services
     *        Regions, such as us-east-1 or ap-northeast-3, provide the Region codes. For a list of Region codes, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/securitylake.html">Amazon Security Lake endpoints</a>
     *        in the Amazon Web Services General Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Region
     */

    public CreateDatalakeRequest withRegions(Region... regions) {
        java.util.ArrayList<String> regionsCopy = new java.util.ArrayList<String>(regions.length);
        for (Region value : regions) {
            regionsCopy.add(value.toString());
        }
        if (getRegions() == null) {
            setRegions(regionsCopy);
        } else {
            getRegions().addAll(regionsCopy);
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
        if (getConfigurations() != null)
            sb.append("Configurations: ").append(getConfigurations()).append(",");
        if (getEnableAll() != null)
            sb.append("EnableAll: ").append(getEnableAll()).append(",");
        if (getMetaStoreManagerRoleArn() != null)
            sb.append("MetaStoreManagerRoleArn: ").append(getMetaStoreManagerRoleArn()).append(",");
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDatalakeRequest == false)
            return false;
        CreateDatalakeRequest other = (CreateDatalakeRequest) obj;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        if (other.getEnableAll() == null ^ this.getEnableAll() == null)
            return false;
        if (other.getEnableAll() != null && other.getEnableAll().equals(this.getEnableAll()) == false)
            return false;
        if (other.getMetaStoreManagerRoleArn() == null ^ this.getMetaStoreManagerRoleArn() == null)
            return false;
        if (other.getMetaStoreManagerRoleArn() != null && other.getMetaStoreManagerRoleArn().equals(this.getMetaStoreManagerRoleArn()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        hashCode = prime * hashCode + ((getEnableAll() == null) ? 0 : getEnableAll().hashCode());
        hashCode = prime * hashCode + ((getMetaStoreManagerRoleArn() == null) ? 0 : getMetaStoreManagerRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatalakeRequest clone() {
        return (CreateDatalakeRequest) super.clone();
    }

}
