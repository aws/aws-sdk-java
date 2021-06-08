/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The structure representing the GetRecommendationsRequest.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecommendationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The start time of the profile to get analysis data about. You must specify <code>startTime</code> and
     * <code>endTime</code>. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     * represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The language used to provide analysis. Specify using a string that is one of the following <code>BCP 47</code>
     * language codes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>de-DE</code> - German, Germany
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>en-GB</code> - English, United Kingdom
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>en-US</code> - English, United States
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>es-ES</code> - Spanish, Spain
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fr-FR</code> - French, France
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>it-IT</code> - Italian, Italy
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ja-JP</code> - Japanese, Japan
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ko-KR</code> - Korean, Republic of Korea
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pt-BR</code> - Portugese, Brazil
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh-CN</code> - Chinese, China
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh-TW</code> - Chinese, Taiwan
     * </p>
     * </li>
     * </ul>
     */
    private String locale;
    /**
     * <p>
     * The name of the profiling group to get analysis data about.
     * </p>
     */
    private String profilingGroupName;
    /**
     * <p>
     * The end time of the profile to get analysis data about. You must specify <code>startTime</code> and
     * <code>endTime</code>. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     * represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The start time of the profile to get analysis data about. You must specify <code>startTime</code> and
     * <code>endTime</code>. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     * represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param endTime
     *        The start time of the profile to get analysis data about. You must specify <code>startTime</code> and
     *        <code>endTime</code>. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     *        represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The start time of the profile to get analysis data about. You must specify <code>startTime</code> and
     * <code>endTime</code>. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     * represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @return The start time of the profile to get analysis data about. You must specify <code>startTime</code> and
     *         <code>endTime</code>. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     *         represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The start time of the profile to get analysis data about. You must specify <code>startTime</code> and
     * <code>endTime</code>. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     * represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param endTime
     *        The start time of the profile to get analysis data about. You must specify <code>startTime</code> and
     *        <code>endTime</code>. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     *        represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The language used to provide analysis. Specify using a string that is one of the following <code>BCP 47</code>
     * language codes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>de-DE</code> - German, Germany
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>en-GB</code> - English, United Kingdom
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>en-US</code> - English, United States
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>es-ES</code> - Spanish, Spain
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fr-FR</code> - French, France
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>it-IT</code> - Italian, Italy
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ja-JP</code> - Japanese, Japan
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ko-KR</code> - Korean, Republic of Korea
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pt-BR</code> - Portugese, Brazil
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh-CN</code> - Chinese, China
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh-TW</code> - Chinese, Taiwan
     * </p>
     * </li>
     * </ul>
     * 
     * @param locale
     *        The language used to provide analysis. Specify using a string that is one of the following
     *        <code>BCP 47</code> language codes. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>de-DE</code> - German, Germany
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>en-GB</code> - English, United Kingdom
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>en-US</code> - English, United States
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>es-ES</code> - Spanish, Spain
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fr-FR</code> - French, France
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>it-IT</code> - Italian, Italy
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ja-JP</code> - Japanese, Japan
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ko-KR</code> - Korean, Republic of Korea
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pt-BR</code> - Portugese, Brazil
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh-CN</code> - Chinese, China
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh-TW</code> - Chinese, Taiwan
     *        </p>
     *        </li>
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The language used to provide analysis. Specify using a string that is one of the following <code>BCP 47</code>
     * language codes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>de-DE</code> - German, Germany
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>en-GB</code> - English, United Kingdom
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>en-US</code> - English, United States
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>es-ES</code> - Spanish, Spain
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fr-FR</code> - French, France
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>it-IT</code> - Italian, Italy
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ja-JP</code> - Japanese, Japan
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ko-KR</code> - Korean, Republic of Korea
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pt-BR</code> - Portugese, Brazil
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh-CN</code> - Chinese, China
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh-TW</code> - Chinese, Taiwan
     * </p>
     * </li>
     * </ul>
     * 
     * @return The language used to provide analysis. Specify using a string that is one of the following
     *         <code>BCP 47</code> language codes. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>de-DE</code> - German, Germany
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>en-GB</code> - English, United Kingdom
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>en-US</code> - English, United States
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>es-ES</code> - Spanish, Spain
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fr-FR</code> - French, France
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>it-IT</code> - Italian, Italy
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ja-JP</code> - Japanese, Japan
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ko-KR</code> - Korean, Republic of Korea
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pt-BR</code> - Portugese, Brazil
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh-CN</code> - Chinese, China
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh-TW</code> - Chinese, Taiwan
     *         </p>
     *         </li>
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * The language used to provide analysis. Specify using a string that is one of the following <code>BCP 47</code>
     * language codes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>de-DE</code> - German, Germany
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>en-GB</code> - English, United Kingdom
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>en-US</code> - English, United States
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>es-ES</code> - Spanish, Spain
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fr-FR</code> - French, France
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>it-IT</code> - Italian, Italy
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ja-JP</code> - Japanese, Japan
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ko-KR</code> - Korean, Republic of Korea
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pt-BR</code> - Portugese, Brazil
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh-CN</code> - Chinese, China
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh-TW</code> - Chinese, Taiwan
     * </p>
     * </li>
     * </ul>
     * 
     * @param locale
     *        The language used to provide analysis. Specify using a string that is one of the following
     *        <code>BCP 47</code> language codes. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>de-DE</code> - German, Germany
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>en-GB</code> - English, United Kingdom
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>en-US</code> - English, United States
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>es-ES</code> - Spanish, Spain
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fr-FR</code> - French, France
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>it-IT</code> - Italian, Italy
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ja-JP</code> - Japanese, Japan
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ko-KR</code> - Korean, Republic of Korea
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pt-BR</code> - Portugese, Brazil
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh-CN</code> - Chinese, China
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh-TW</code> - Chinese, Taiwan
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsRequest withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * <p>
     * The name of the profiling group to get analysis data about.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group to get analysis data about.
     */

    public void setProfilingGroupName(String profilingGroupName) {
        this.profilingGroupName = profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group to get analysis data about.
     * </p>
     * 
     * @return The name of the profiling group to get analysis data about.
     */

    public String getProfilingGroupName() {
        return this.profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group to get analysis data about.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group to get analysis data about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsRequest withProfilingGroupName(String profilingGroupName) {
        setProfilingGroupName(profilingGroupName);
        return this;
    }

    /**
     * <p>
     * The end time of the profile to get analysis data about. You must specify <code>startTime</code> and
     * <code>endTime</code>. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     * represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param startTime
     *        The end time of the profile to get analysis data about. You must specify <code>startTime</code> and
     *        <code>endTime</code>. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     *        represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The end time of the profile to get analysis data about. You must specify <code>startTime</code> and
     * <code>endTime</code>. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     * represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @return The end time of the profile to get analysis data about. You must specify <code>startTime</code> and
     *         <code>endTime</code>. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     *         represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The end time of the profile to get analysis data about. You must specify <code>startTime</code> and
     * <code>endTime</code>. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     * represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param startTime
     *        The end time of the profile to get analysis data about. You must specify <code>startTime</code> and
     *        <code>endTime</code>. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z
     *        represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getLocale() != null)
            sb.append("Locale: ").append(getLocale()).append(",");
        if (getProfilingGroupName() != null)
            sb.append("ProfilingGroupName: ").append(getProfilingGroupName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecommendationsRequest == false)
            return false;
        GetRecommendationsRequest other = (GetRecommendationsRequest) obj;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        if (other.getProfilingGroupName() == null ^ this.getProfilingGroupName() == null)
            return false;
        if (other.getProfilingGroupName() != null && other.getProfilingGroupName().equals(this.getProfilingGroupName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode + ((getProfilingGroupName() == null) ? 0 : getProfilingGroupName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public GetRecommendationsRequest clone() {
        return (GetRecommendationsRequest) super.clone();
    }

}
