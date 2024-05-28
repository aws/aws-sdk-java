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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAppVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter supports only failover region and account.
     * </p>
     * </note>
     */
    private java.util.Map<String, java.util.List<String>> additionalInfo;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     */
    private String appArn;
    /**
     * <p>
     * Resilience Hub application version.
     * </p>
     */
    private String appVersion;

    /**
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter supports only failover region and account.
     * </p>
     * </note>
     * 
     * @return Additional configuration parameters for an Resilience Hub application. If you want to implement
     *         <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     *         href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     *         application configuration parameters</a>.</p> <note>
     *         <p>
     *         Currently, this parameter supports only failover region and account.
     *         </p>
     */

    public java.util.Map<String, java.util.List<String>> getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter supports only failover region and account.
     * </p>
     * </note>
     * 
     * @param additionalInfo
     *        Additional configuration parameters for an Resilience Hub application. If you want to implement
     *        <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     *        href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     *        application configuration parameters</a>.</p> <note>
     *        <p>
     *        Currently, this parameter supports only failover region and account.
     *        </p>
     */

    public void setAdditionalInfo(java.util.Map<String, java.util.List<String>> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter supports only failover region and account.
     * </p>
     * </note>
     * 
     * @param additionalInfo
     *        Additional configuration parameters for an Resilience Hub application. If you want to implement
     *        <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     *        href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     *        application configuration parameters</a>.</p> <note>
     *        <p>
     *        Currently, this parameter supports only failover region and account.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppVersionResult withAdditionalInfo(java.util.Map<String, java.util.List<String>> additionalInfo) {
        setAdditionalInfo(additionalInfo);
        return this;
    }

    /**
     * Add a single AdditionalInfo entry
     *
     * @see DescribeAppVersionResult#withAdditionalInfo
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppVersionResult addAdditionalInfoEntry(String key, java.util.List<String> value) {
        if (null == this.additionalInfo) {
            this.additionalInfo = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.additionalInfo.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.additionalInfo.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalInfo.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppVersionResult clearAdditionalInfoEntries() {
        this.additionalInfo = null;
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param appArn
     *        Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For
     *        more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     *         <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>.
     *         For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public String getAppArn() {
        return this.appArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param appArn
     *        Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For
     *        more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppVersionResult withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * Resilience Hub application version.
     * </p>
     * 
     * @param appVersion
     *        Resilience Hub application version.
     */

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * <p>
     * Resilience Hub application version.
     * </p>
     * 
     * @return Resilience Hub application version.
     */

    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * <p>
     * Resilience Hub application version.
     * </p>
     * 
     * @param appVersion
     *        Resilience Hub application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppVersionResult withAppVersion(String appVersion) {
        setAppVersion(appVersion);
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
        if (getAdditionalInfo() != null)
            sb.append("AdditionalInfo: ").append(getAdditionalInfo()).append(",");
        if (getAppArn() != null)
            sb.append("AppArn: ").append(getAppArn()).append(",");
        if (getAppVersion() != null)
            sb.append("AppVersion: ").append(getAppVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAppVersionResult == false)
            return false;
        DescribeAppVersionResult other = (DescribeAppVersionResult) obj;
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null)
            return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false)
            return false;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getAppVersion() == null ^ this.getAppVersion() == null)
            return false;
        if (other.getAppVersion() != null && other.getAppVersion().equals(this.getAppVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getAppVersion() == null) ? 0 : getAppVersion().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAppVersionResult clone() {
        try {
            return (DescribeAppVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
