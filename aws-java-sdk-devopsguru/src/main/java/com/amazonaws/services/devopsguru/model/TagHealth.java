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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the health of Amazon Web Services resources in your account that are specified by an Amazon Web
 * Services tag <i>key</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/TagHealth" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagHealth implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An Amazon Web Services tag <i>key</i> that is used to identify the Amazon Web Services resources that DevOps Guru
     * analyzes. All Amazon Web Services resources in your account and Region tagged with this <i>key</i> make up your
     * DevOps Guru application and analysis boundary.
     * </p>
     * <important>
     * <p>
     * The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with the
     * prefix <code>Devops-guru-</code>. The tag <i>key</i> might be <code>DevOps-Guru-deployment-application</code> or
     * <code>devops-guru-rds-application</code>. When you create a <i>key</i>, the case of characters in the <i>key</i>
     * can be whatever you choose. After you create a <i>key</i>, it is case-sensitive. For example, DevOps Guru works
     * with a <i>key</i> named <code>devops-guru-rds</code> and a <i>key</i> named <code>DevOps-Guru-RDS</code>, and
     * these act as two different <i>keys</i>. Possible <i>key</i>/<i>value</i> pairs in your application might be
     * <code>Devops-Guru-production-application/RDS</code> or <code>Devops-Guru-production-application/containers</code>
     * .
     * </p>
     * </important>
     */
    private String appBoundaryKey;
    /**
     * <p>
     * The value in an Amazon Web Services tag.
     * </p>
     * <p>
     * The tag's <i>value</i> is an optional field used to associate a string with the tag <i>key</i> (for example,
     * <code>111122223333</code>, <code>Production</code>, or a team name). The <i>key</i> and <i>value</i> are the
     * tag's <i>key</i> pair. Omitting the tag <i>value</i> is the same as using an empty string. Like tag <i>keys</i>,
     * tag <i>values</i> are case-sensitive. You can specify a maximum of 256 characters for a tag value.
     * </p>
     */
    private String tagValue;
    /**
     * <p>
     * Information about the health of the Amazon Web Services resources in your account that are specified by an Amazon
     * Web Services tag, including the number of open proactive, open reactive insights, and the Mean Time to Recover
     * (MTTR) of closed insights.
     * </p>
     */
    private InsightHealth insight;
    /**
     * <p>
     * Number of resources that DevOps Guru is monitoring in your account that are specified by an Amazon Web Services
     * tag.
     * </p>
     */
    private Long analyzedResourceCount;

    /**
     * <p>
     * An Amazon Web Services tag <i>key</i> that is used to identify the Amazon Web Services resources that DevOps Guru
     * analyzes. All Amazon Web Services resources in your account and Region tagged with this <i>key</i> make up your
     * DevOps Guru application and analysis boundary.
     * </p>
     * <important>
     * <p>
     * The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with the
     * prefix <code>Devops-guru-</code>. The tag <i>key</i> might be <code>DevOps-Guru-deployment-application</code> or
     * <code>devops-guru-rds-application</code>. When you create a <i>key</i>, the case of characters in the <i>key</i>
     * can be whatever you choose. After you create a <i>key</i>, it is case-sensitive. For example, DevOps Guru works
     * with a <i>key</i> named <code>devops-guru-rds</code> and a <i>key</i> named <code>DevOps-Guru-RDS</code>, and
     * these act as two different <i>keys</i>. Possible <i>key</i>/<i>value</i> pairs in your application might be
     * <code>Devops-Guru-production-application/RDS</code> or <code>Devops-Guru-production-application/containers</code>
     * .
     * </p>
     * </important>
     * 
     * @param appBoundaryKey
     *        An Amazon Web Services tag <i>key</i> that is used to identify the Amazon Web Services resources that
     *        DevOps Guru analyzes. All Amazon Web Services resources in your account and Region tagged with this
     *        <i>key</i> make up your DevOps Guru application and analysis boundary.</p> <important>
     *        <p>
     *        The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with
     *        the prefix <code>Devops-guru-</code>. The tag <i>key</i> might be
     *        <code>DevOps-Guru-deployment-application</code> or <code>devops-guru-rds-application</code>. When you
     *        create a <i>key</i>, the case of characters in the <i>key</i> can be whatever you choose. After you create
     *        a <i>key</i>, it is case-sensitive. For example, DevOps Guru works with a <i>key</i> named
     *        <code>devops-guru-rds</code> and a <i>key</i> named <code>DevOps-Guru-RDS</code>, and these act as two
     *        different <i>keys</i>. Possible <i>key</i>/<i>value</i> pairs in your application might be
     *        <code>Devops-Guru-production-application/RDS</code> or
     *        <code>Devops-Guru-production-application/containers</code>.
     *        </p>
     */

    public void setAppBoundaryKey(String appBoundaryKey) {
        this.appBoundaryKey = appBoundaryKey;
    }

    /**
     * <p>
     * An Amazon Web Services tag <i>key</i> that is used to identify the Amazon Web Services resources that DevOps Guru
     * analyzes. All Amazon Web Services resources in your account and Region tagged with this <i>key</i> make up your
     * DevOps Guru application and analysis boundary.
     * </p>
     * <important>
     * <p>
     * The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with the
     * prefix <code>Devops-guru-</code>. The tag <i>key</i> might be <code>DevOps-Guru-deployment-application</code> or
     * <code>devops-guru-rds-application</code>. When you create a <i>key</i>, the case of characters in the <i>key</i>
     * can be whatever you choose. After you create a <i>key</i>, it is case-sensitive. For example, DevOps Guru works
     * with a <i>key</i> named <code>devops-guru-rds</code> and a <i>key</i> named <code>DevOps-Guru-RDS</code>, and
     * these act as two different <i>keys</i>. Possible <i>key</i>/<i>value</i> pairs in your application might be
     * <code>Devops-Guru-production-application/RDS</code> or <code>Devops-Guru-production-application/containers</code>
     * .
     * </p>
     * </important>
     * 
     * @return An Amazon Web Services tag <i>key</i> that is used to identify the Amazon Web Services resources that
     *         DevOps Guru analyzes. All Amazon Web Services resources in your account and Region tagged with this
     *         <i>key</i> make up your DevOps Guru application and analysis boundary.</p> <important>
     *         <p>
     *         The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with
     *         the prefix <code>Devops-guru-</code>. The tag <i>key</i> might be
     *         <code>DevOps-Guru-deployment-application</code> or <code>devops-guru-rds-application</code>. When you
     *         create a <i>key</i>, the case of characters in the <i>key</i> can be whatever you choose. After you
     *         create a <i>key</i>, it is case-sensitive. For example, DevOps Guru works with a <i>key</i> named
     *         <code>devops-guru-rds</code> and a <i>key</i> named <code>DevOps-Guru-RDS</code>, and these act as two
     *         different <i>keys</i>. Possible <i>key</i>/<i>value</i> pairs in your application might be
     *         <code>Devops-Guru-production-application/RDS</code> or
     *         <code>Devops-Guru-production-application/containers</code>.
     *         </p>
     */

    public String getAppBoundaryKey() {
        return this.appBoundaryKey;
    }

    /**
     * <p>
     * An Amazon Web Services tag <i>key</i> that is used to identify the Amazon Web Services resources that DevOps Guru
     * analyzes. All Amazon Web Services resources in your account and Region tagged with this <i>key</i> make up your
     * DevOps Guru application and analysis boundary.
     * </p>
     * <important>
     * <p>
     * The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with the
     * prefix <code>Devops-guru-</code>. The tag <i>key</i> might be <code>DevOps-Guru-deployment-application</code> or
     * <code>devops-guru-rds-application</code>. When you create a <i>key</i>, the case of characters in the <i>key</i>
     * can be whatever you choose. After you create a <i>key</i>, it is case-sensitive. For example, DevOps Guru works
     * with a <i>key</i> named <code>devops-guru-rds</code> and a <i>key</i> named <code>DevOps-Guru-RDS</code>, and
     * these act as two different <i>keys</i>. Possible <i>key</i>/<i>value</i> pairs in your application might be
     * <code>Devops-Guru-production-application/RDS</code> or <code>Devops-Guru-production-application/containers</code>
     * .
     * </p>
     * </important>
     * 
     * @param appBoundaryKey
     *        An Amazon Web Services tag <i>key</i> that is used to identify the Amazon Web Services resources that
     *        DevOps Guru analyzes. All Amazon Web Services resources in your account and Region tagged with this
     *        <i>key</i> make up your DevOps Guru application and analysis boundary.</p> <important>
     *        <p>
     *        The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with
     *        the prefix <code>Devops-guru-</code>. The tag <i>key</i> might be
     *        <code>DevOps-Guru-deployment-application</code> or <code>devops-guru-rds-application</code>. When you
     *        create a <i>key</i>, the case of characters in the <i>key</i> can be whatever you choose. After you create
     *        a <i>key</i>, it is case-sensitive. For example, DevOps Guru works with a <i>key</i> named
     *        <code>devops-guru-rds</code> and a <i>key</i> named <code>DevOps-Guru-RDS</code>, and these act as two
     *        different <i>keys</i>. Possible <i>key</i>/<i>value</i> pairs in your application might be
     *        <code>Devops-Guru-production-application/RDS</code> or
     *        <code>Devops-Guru-production-application/containers</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagHealth withAppBoundaryKey(String appBoundaryKey) {
        setAppBoundaryKey(appBoundaryKey);
        return this;
    }

    /**
     * <p>
     * The value in an Amazon Web Services tag.
     * </p>
     * <p>
     * The tag's <i>value</i> is an optional field used to associate a string with the tag <i>key</i> (for example,
     * <code>111122223333</code>, <code>Production</code>, or a team name). The <i>key</i> and <i>value</i> are the
     * tag's <i>key</i> pair. Omitting the tag <i>value</i> is the same as using an empty string. Like tag <i>keys</i>,
     * tag <i>values</i> are case-sensitive. You can specify a maximum of 256 characters for a tag value.
     * </p>
     * 
     * @param tagValue
     *        The value in an Amazon Web Services tag.</p>
     *        <p>
     *        The tag's <i>value</i> is an optional field used to associate a string with the tag <i>key</i> (for
     *        example, <code>111122223333</code>, <code>Production</code>, or a team name). The <i>key</i> and
     *        <i>value</i> are the tag's <i>key</i> pair. Omitting the tag <i>value</i> is the same as using an empty
     *        string. Like tag <i>keys</i>, tag <i>values</i> are case-sensitive. You can specify a maximum of 256
     *        characters for a tag value.
     */

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    /**
     * <p>
     * The value in an Amazon Web Services tag.
     * </p>
     * <p>
     * The tag's <i>value</i> is an optional field used to associate a string with the tag <i>key</i> (for example,
     * <code>111122223333</code>, <code>Production</code>, or a team name). The <i>key</i> and <i>value</i> are the
     * tag's <i>key</i> pair. Omitting the tag <i>value</i> is the same as using an empty string. Like tag <i>keys</i>,
     * tag <i>values</i> are case-sensitive. You can specify a maximum of 256 characters for a tag value.
     * </p>
     * 
     * @return The value in an Amazon Web Services tag.</p>
     *         <p>
     *         The tag's <i>value</i> is an optional field used to associate a string with the tag <i>key</i> (for
     *         example, <code>111122223333</code>, <code>Production</code>, or a team name). The <i>key</i> and
     *         <i>value</i> are the tag's <i>key</i> pair. Omitting the tag <i>value</i> is the same as using an empty
     *         string. Like tag <i>keys</i>, tag <i>values</i> are case-sensitive. You can specify a maximum of 256
     *         characters for a tag value.
     */

    public String getTagValue() {
        return this.tagValue;
    }

    /**
     * <p>
     * The value in an Amazon Web Services tag.
     * </p>
     * <p>
     * The tag's <i>value</i> is an optional field used to associate a string with the tag <i>key</i> (for example,
     * <code>111122223333</code>, <code>Production</code>, or a team name). The <i>key</i> and <i>value</i> are the
     * tag's <i>key</i> pair. Omitting the tag <i>value</i> is the same as using an empty string. Like tag <i>keys</i>,
     * tag <i>values</i> are case-sensitive. You can specify a maximum of 256 characters for a tag value.
     * </p>
     * 
     * @param tagValue
     *        The value in an Amazon Web Services tag.</p>
     *        <p>
     *        The tag's <i>value</i> is an optional field used to associate a string with the tag <i>key</i> (for
     *        example, <code>111122223333</code>, <code>Production</code>, or a team name). The <i>key</i> and
     *        <i>value</i> are the tag's <i>key</i> pair. Omitting the tag <i>value</i> is the same as using an empty
     *        string. Like tag <i>keys</i>, tag <i>values</i> are case-sensitive. You can specify a maximum of 256
     *        characters for a tag value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagHealth withTagValue(String tagValue) {
        setTagValue(tagValue);
        return this;
    }

    /**
     * <p>
     * Information about the health of the Amazon Web Services resources in your account that are specified by an Amazon
     * Web Services tag, including the number of open proactive, open reactive insights, and the Mean Time to Recover
     * (MTTR) of closed insights.
     * </p>
     * 
     * @param insight
     *        Information about the health of the Amazon Web Services resources in your account that are specified by an
     *        Amazon Web Services tag, including the number of open proactive, open reactive insights, and the Mean Time
     *        to Recover (MTTR) of closed insights.
     */

    public void setInsight(InsightHealth insight) {
        this.insight = insight;
    }

    /**
     * <p>
     * Information about the health of the Amazon Web Services resources in your account that are specified by an Amazon
     * Web Services tag, including the number of open proactive, open reactive insights, and the Mean Time to Recover
     * (MTTR) of closed insights.
     * </p>
     * 
     * @return Information about the health of the Amazon Web Services resources in your account that are specified by
     *         an Amazon Web Services tag, including the number of open proactive, open reactive insights, and the Mean
     *         Time to Recover (MTTR) of closed insights.
     */

    public InsightHealth getInsight() {
        return this.insight;
    }

    /**
     * <p>
     * Information about the health of the Amazon Web Services resources in your account that are specified by an Amazon
     * Web Services tag, including the number of open proactive, open reactive insights, and the Mean Time to Recover
     * (MTTR) of closed insights.
     * </p>
     * 
     * @param insight
     *        Information about the health of the Amazon Web Services resources in your account that are specified by an
     *        Amazon Web Services tag, including the number of open proactive, open reactive insights, and the Mean Time
     *        to Recover (MTTR) of closed insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagHealth withInsight(InsightHealth insight) {
        setInsight(insight);
        return this;
    }

    /**
     * <p>
     * Number of resources that DevOps Guru is monitoring in your account that are specified by an Amazon Web Services
     * tag.
     * </p>
     * 
     * @param analyzedResourceCount
     *        Number of resources that DevOps Guru is monitoring in your account that are specified by an Amazon Web
     *        Services tag.
     */

    public void setAnalyzedResourceCount(Long analyzedResourceCount) {
        this.analyzedResourceCount = analyzedResourceCount;
    }

    /**
     * <p>
     * Number of resources that DevOps Guru is monitoring in your account that are specified by an Amazon Web Services
     * tag.
     * </p>
     * 
     * @return Number of resources that DevOps Guru is monitoring in your account that are specified by an Amazon Web
     *         Services tag.
     */

    public Long getAnalyzedResourceCount() {
        return this.analyzedResourceCount;
    }

    /**
     * <p>
     * Number of resources that DevOps Guru is monitoring in your account that are specified by an Amazon Web Services
     * tag.
     * </p>
     * 
     * @param analyzedResourceCount
     *        Number of resources that DevOps Guru is monitoring in your account that are specified by an Amazon Web
     *        Services tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagHealth withAnalyzedResourceCount(Long analyzedResourceCount) {
        setAnalyzedResourceCount(analyzedResourceCount);
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
        if (getAppBoundaryKey() != null)
            sb.append("AppBoundaryKey: ").append(getAppBoundaryKey()).append(",");
        if (getTagValue() != null)
            sb.append("TagValue: ").append(getTagValue()).append(",");
        if (getInsight() != null)
            sb.append("Insight: ").append(getInsight()).append(",");
        if (getAnalyzedResourceCount() != null)
            sb.append("AnalyzedResourceCount: ").append(getAnalyzedResourceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagHealth == false)
            return false;
        TagHealth other = (TagHealth) obj;
        if (other.getAppBoundaryKey() == null ^ this.getAppBoundaryKey() == null)
            return false;
        if (other.getAppBoundaryKey() != null && other.getAppBoundaryKey().equals(this.getAppBoundaryKey()) == false)
            return false;
        if (other.getTagValue() == null ^ this.getTagValue() == null)
            return false;
        if (other.getTagValue() != null && other.getTagValue().equals(this.getTagValue()) == false)
            return false;
        if (other.getInsight() == null ^ this.getInsight() == null)
            return false;
        if (other.getInsight() != null && other.getInsight().equals(this.getInsight()) == false)
            return false;
        if (other.getAnalyzedResourceCount() == null ^ this.getAnalyzedResourceCount() == null)
            return false;
        if (other.getAnalyzedResourceCount() != null && other.getAnalyzedResourceCount().equals(this.getAnalyzedResourceCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppBoundaryKey() == null) ? 0 : getAppBoundaryKey().hashCode());
        hashCode = prime * hashCode + ((getTagValue() == null) ? 0 : getTagValue().hashCode());
        hashCode = prime * hashCode + ((getInsight() == null) ? 0 : getInsight().hashCode());
        hashCode = prime * hashCode + ((getAnalyzedResourceCount() == null) ? 0 : getAnalyzedResourceCount().hashCode());
        return hashCode;
    }

    @Override
    public TagHealth clone() {
        try {
            return (TagHealth) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.TagHealthMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
