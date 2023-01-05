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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ImportResourcesToDraftAppVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportResourcesToDraftAppVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String appArn;
    /**
     * <p>
     * The version of the application.
     * </p>
     */
    private String appVersion;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the resources that you imported.
     * </p>
     */
    private java.util.List<String> sourceArns;
    /**
     * <p>
     * The status of the action.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A list of terraform file s3 URLs you need to import.
     * </p>
     */
    private java.util.List<TerraformSource> terraformSources;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param appArn
     *        The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *        about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *        Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *         :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *         about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *         Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public String getAppArn() {
        return this.appArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param appArn
     *        The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *        about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *        Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportResourcesToDraftAppVersionResult withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @param appVersion
     *        The version of the application.
     */

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @return The version of the application.
     */

    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @param appVersion
     *        The version of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportResourcesToDraftAppVersionResult withAppVersion(String appVersion) {
        setAppVersion(appVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the resources that you imported.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) for the resources that you imported.
     */

    public java.util.List<String> getSourceArns() {
        return sourceArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the resources that you imported.
     * </p>
     * 
     * @param sourceArns
     *        The Amazon Resource Names (ARNs) for the resources that you imported.
     */

    public void setSourceArns(java.util.Collection<String> sourceArns) {
        if (sourceArns == null) {
            this.sourceArns = null;
            return;
        }

        this.sourceArns = new java.util.ArrayList<String>(sourceArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the resources that you imported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceArns(java.util.Collection)} or {@link #withSourceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sourceArns
     *        The Amazon Resource Names (ARNs) for the resources that you imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportResourcesToDraftAppVersionResult withSourceArns(String... sourceArns) {
        if (this.sourceArns == null) {
            setSourceArns(new java.util.ArrayList<String>(sourceArns.length));
        }
        for (String ele : sourceArns) {
            this.sourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) for the resources that you imported.
     * </p>
     * 
     * @param sourceArns
     *        The Amazon Resource Names (ARNs) for the resources that you imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportResourcesToDraftAppVersionResult withSourceArns(java.util.Collection<String> sourceArns) {
        setSourceArns(sourceArns);
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @see ResourceImportStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @return The status of the action.
     * @see ResourceImportStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceImportStatusType
     */

    public ImportResourcesToDraftAppVersionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceImportStatusType
     */

    public ImportResourcesToDraftAppVersionResult withStatus(ResourceImportStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A list of terraform file s3 URLs you need to import.
     * </p>
     * 
     * @return A list of terraform file s3 URLs you need to import.
     */

    public java.util.List<TerraformSource> getTerraformSources() {
        return terraformSources;
    }

    /**
     * <p>
     * A list of terraform file s3 URLs you need to import.
     * </p>
     * 
     * @param terraformSources
     *        A list of terraform file s3 URLs you need to import.
     */

    public void setTerraformSources(java.util.Collection<TerraformSource> terraformSources) {
        if (terraformSources == null) {
            this.terraformSources = null;
            return;
        }

        this.terraformSources = new java.util.ArrayList<TerraformSource>(terraformSources);
    }

    /**
     * <p>
     * A list of terraform file s3 URLs you need to import.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTerraformSources(java.util.Collection)} or {@link #withTerraformSources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param terraformSources
     *        A list of terraform file s3 URLs you need to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportResourcesToDraftAppVersionResult withTerraformSources(TerraformSource... terraformSources) {
        if (this.terraformSources == null) {
            setTerraformSources(new java.util.ArrayList<TerraformSource>(terraformSources.length));
        }
        for (TerraformSource ele : terraformSources) {
            this.terraformSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of terraform file s3 URLs you need to import.
     * </p>
     * 
     * @param terraformSources
     *        A list of terraform file s3 URLs you need to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportResourcesToDraftAppVersionResult withTerraformSources(java.util.Collection<TerraformSource> terraformSources) {
        setTerraformSources(terraformSources);
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
        if (getAppArn() != null)
            sb.append("AppArn: ").append(getAppArn()).append(",");
        if (getAppVersion() != null)
            sb.append("AppVersion: ").append(getAppVersion()).append(",");
        if (getSourceArns() != null)
            sb.append("SourceArns: ").append(getSourceArns()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTerraformSources() != null)
            sb.append("TerraformSources: ").append(getTerraformSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportResourcesToDraftAppVersionResult == false)
            return false;
        ImportResourcesToDraftAppVersionResult other = (ImportResourcesToDraftAppVersionResult) obj;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getAppVersion() == null ^ this.getAppVersion() == null)
            return false;
        if (other.getAppVersion() != null && other.getAppVersion().equals(this.getAppVersion()) == false)
            return false;
        if (other.getSourceArns() == null ^ this.getSourceArns() == null)
            return false;
        if (other.getSourceArns() != null && other.getSourceArns().equals(this.getSourceArns()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTerraformSources() == null ^ this.getTerraformSources() == null)
            return false;
        if (other.getTerraformSources() != null && other.getTerraformSources().equals(this.getTerraformSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getAppVersion() == null) ? 0 : getAppVersion().hashCode());
        hashCode = prime * hashCode + ((getSourceArns() == null) ? 0 : getSourceArns().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTerraformSources() == null) ? 0 : getTerraformSources().hashCode());
        return hashCode;
    }

    @Override
    public ImportResourcesToDraftAppVersionResult clone() {
        try {
            return (ImportResourcesToDraftAppVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
