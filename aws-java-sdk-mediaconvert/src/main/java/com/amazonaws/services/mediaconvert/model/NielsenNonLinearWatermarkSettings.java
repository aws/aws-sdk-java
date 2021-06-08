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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Ignore these settings unless you are using Nielsen non-linear watermarking. Specify the values that MediaConvert uses
 * to generate and place Nielsen watermarks in your output audio. In addition to specifying these values, you also need
 * to set up your cloud TIC server. These settings apply to every output in your job. The MediaConvert implementation is
 * currently with the following Nielsen versions: Nielsen Watermark SDK Version 5.2.1 Nielsen NLM Watermark Engine
 * Version 1.2.7 Nielsen Watermark Authenticator [SID_TIC] Version [5.0.0]
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/NielsenNonLinearWatermarkSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NielsenNonLinearWatermarkSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Choose the type of Nielsen watermarks that you want in your outputs. When you choose NAES 2 and NW
     * (NAES2_AND_NW), you must provide a value for the setting SID (sourceId). When you choose CBET (CBET), you must
     * provide a value for the setting CSID (cbetSourceId). When you choose NAES 2, NW, and CBET (NAES2_AND_NW_AND_CBET),
     * you must provide values for both of these settings.
     */
    private String activeWatermarkProcess;
    /**
     * Optional. Use this setting when you want the service to include an ADI file in the Nielsen metadata .zip file. To
     * provide an ADI file, store it in Amazon S3 and provide a URL to it here. The URL should be in the following
     * format: S3://bucket/path/ADI-file. For more information about the metadata .zip file, see the setting Metadata
     * destination (metadataDestination).
     */
    private String adiFilename;
    /**
     * Use the asset ID that you provide to Nielsen to uniquely identify this asset. Required for all Nielsen non-linear
     * watermarking.
     */
    private String assetId;
    /** Use the asset name that you provide to Nielsen for this asset. Required for all Nielsen non-linear watermarking. */
    private String assetName;
    /**
     * Use the CSID that Nielsen provides to you. This CBET source ID should be unique to your Nielsen account but
     * common to all of your output assets that have CBET watermarking. Required when you choose a value for the setting
     * Watermark types (ActiveWatermarkProcess) that includes CBET.
     */
    private String cbetSourceId;
    /** Optional. If this asset uses an episode ID with Nielsen, provide it here. */
    private String episodeId;
    /**
     * Specify the Amazon S3 location where you want MediaConvert to save your Nielsen non-linear metadata .zip file.
     * This Amazon S3 bucket must be in the same Region as the one where you do your MediaConvert transcoding. If you
     * want to include an ADI file in this .zip file, use the setting ADI file (adiFilename) to specify it. MediaConvert
     * delivers the Nielsen metadata .zip files only to your metadata destination Amazon S3 bucket. It doesn't deliver
     * the .zip files to Nielsen. You are responsible for delivering the metadata .zip files to Nielsen.
     */
    private String metadataDestination;
    /**
     * Use the SID that Nielsen provides to you. This source ID should be unique to your Nielsen account but common to
     * all of your output assets. Required for all Nielsen non-linear watermarking. This ID should be unique to your
     * Nielsen account but common to all of your output assets. Required for all Nielsen non-linear watermarking.
     */
    private Integer sourceId;
    /**
     * Required. Specify whether your source content already contains Nielsen non-linear watermarks. When you set this
     * value to Watermarked (WATERMARKED), the service fails the job. Nielsen requires that you add non-linear
     * watermarking to only clean content that doesn't already have non-linear Nielsen watermarks.
     */
    private String sourceWatermarkStatus;
    /**
     * Specify the endpoint for the TIC server that you have deployed and configured in the AWS Cloud. Required for all
     * Nielsen non-linear watermarking. MediaConvert can't connect directly to a TIC server. Instead, you must use API
     * Gateway to provide a RESTful interface between MediaConvert and a TIC server that you deploy in your AWS account.
     * For more information on deploying a TIC server in your AWS account and the required API Gateway, contact Nielsen
     * support.
     */
    private String ticServerUrl;
    /**
     * To create assets that have the same TIC values in each audio track, keep the default value Share TICs
     * (SAME_TICS_PER_TRACK). To create assets that have unique TIC values for each audio track, choose Use unique TICs
     * (RESERVE_UNIQUE_TICS_PER_TRACK).
     */
    private String uniqueTicPerAudioTrack;

    /**
     * Choose the type of Nielsen watermarks that you want in your outputs. When you choose NAES 2 and NW
     * (NAES2_AND_NW), you must provide a value for the setting SID (sourceId). When you choose CBET (CBET), you must
     * provide a value for the setting CSID (cbetSourceId). When you choose NAES 2, NW, and CBET (NAES2_AND_NW_AND_CBET),
     * you must provide values for both of these settings.
     * 
     * @param activeWatermarkProcess
     *        Choose the type of Nielsen watermarks that you want in your outputs. When you choose NAES 2 and NW
     *        (NAES2_AND_NW), you must provide a value for the setting SID (sourceId). When you choose CBET (CBET), you
     *        must provide a value for the setting CSID (cbetSourceId). When you choose NAES 2, NW, and CBET
     *        (NAES2_AND_NW_AND_CBET), you must provide values for both of these settings.
     * @see NielsenActiveWatermarkProcessType
     */

    public void setActiveWatermarkProcess(String activeWatermarkProcess) {
        this.activeWatermarkProcess = activeWatermarkProcess;
    }

    /**
     * Choose the type of Nielsen watermarks that you want in your outputs. When you choose NAES 2 and NW
     * (NAES2_AND_NW), you must provide a value for the setting SID (sourceId). When you choose CBET (CBET), you must
     * provide a value for the setting CSID (cbetSourceId). When you choose NAES 2, NW, and CBET (NAES2_AND_NW_AND_CBET),
     * you must provide values for both of these settings.
     * 
     * @return Choose the type of Nielsen watermarks that you want in your outputs. When you choose NAES 2 and NW
     *         (NAES2_AND_NW), you must provide a value for the setting SID (sourceId). When you choose CBET (CBET), you
     *         must provide a value for the setting CSID (cbetSourceId). When you choose NAES 2, NW, and CBET
     *         (NAES2_AND_NW_AND_CBET), you must provide values for both of these settings.
     * @see NielsenActiveWatermarkProcessType
     */

    public String getActiveWatermarkProcess() {
        return this.activeWatermarkProcess;
    }

    /**
     * Choose the type of Nielsen watermarks that you want in your outputs. When you choose NAES 2 and NW
     * (NAES2_AND_NW), you must provide a value for the setting SID (sourceId). When you choose CBET (CBET), you must
     * provide a value for the setting CSID (cbetSourceId). When you choose NAES 2, NW, and CBET (NAES2_AND_NW_AND_CBET),
     * you must provide values for both of these settings.
     * 
     * @param activeWatermarkProcess
     *        Choose the type of Nielsen watermarks that you want in your outputs. When you choose NAES 2 and NW
     *        (NAES2_AND_NW), you must provide a value for the setting SID (sourceId). When you choose CBET (CBET), you
     *        must provide a value for the setting CSID (cbetSourceId). When you choose NAES 2, NW, and CBET
     *        (NAES2_AND_NW_AND_CBET), you must provide values for both of these settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NielsenActiveWatermarkProcessType
     */

    public NielsenNonLinearWatermarkSettings withActiveWatermarkProcess(String activeWatermarkProcess) {
        setActiveWatermarkProcess(activeWatermarkProcess);
        return this;
    }

    /**
     * Choose the type of Nielsen watermarks that you want in your outputs. When you choose NAES 2 and NW
     * (NAES2_AND_NW), you must provide a value for the setting SID (sourceId). When you choose CBET (CBET), you must
     * provide a value for the setting CSID (cbetSourceId). When you choose NAES 2, NW, and CBET (NAES2_AND_NW_AND_CBET),
     * you must provide values for both of these settings.
     * 
     * @param activeWatermarkProcess
     *        Choose the type of Nielsen watermarks that you want in your outputs. When you choose NAES 2 and NW
     *        (NAES2_AND_NW), you must provide a value for the setting SID (sourceId). When you choose CBET (CBET), you
     *        must provide a value for the setting CSID (cbetSourceId). When you choose NAES 2, NW, and CBET
     *        (NAES2_AND_NW_AND_CBET), you must provide values for both of these settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NielsenActiveWatermarkProcessType
     */

    public NielsenNonLinearWatermarkSettings withActiveWatermarkProcess(NielsenActiveWatermarkProcessType activeWatermarkProcess) {
        this.activeWatermarkProcess = activeWatermarkProcess.toString();
        return this;
    }

    /**
     * Optional. Use this setting when you want the service to include an ADI file in the Nielsen metadata .zip file. To
     * provide an ADI file, store it in Amazon S3 and provide a URL to it here. The URL should be in the following
     * format: S3://bucket/path/ADI-file. For more information about the metadata .zip file, see the setting Metadata
     * destination (metadataDestination).
     * 
     * @param adiFilename
     *        Optional. Use this setting when you want the service to include an ADI file in the Nielsen metadata .zip
     *        file. To provide an ADI file, store it in Amazon S3 and provide a URL to it here. The URL should be in the
     *        following format: S3://bucket/path/ADI-file. For more information about the metadata .zip file, see the
     *        setting Metadata destination (metadataDestination).
     */

    public void setAdiFilename(String adiFilename) {
        this.adiFilename = adiFilename;
    }

    /**
     * Optional. Use this setting when you want the service to include an ADI file in the Nielsen metadata .zip file. To
     * provide an ADI file, store it in Amazon S3 and provide a URL to it here. The URL should be in the following
     * format: S3://bucket/path/ADI-file. For more information about the metadata .zip file, see the setting Metadata
     * destination (metadataDestination).
     * 
     * @return Optional. Use this setting when you want the service to include an ADI file in the Nielsen metadata .zip
     *         file. To provide an ADI file, store it in Amazon S3 and provide a URL to it here. The URL should be in
     *         the following format: S3://bucket/path/ADI-file. For more information about the metadata .zip file, see
     *         the setting Metadata destination (metadataDestination).
     */

    public String getAdiFilename() {
        return this.adiFilename;
    }

    /**
     * Optional. Use this setting when you want the service to include an ADI file in the Nielsen metadata .zip file. To
     * provide an ADI file, store it in Amazon S3 and provide a URL to it here. The URL should be in the following
     * format: S3://bucket/path/ADI-file. For more information about the metadata .zip file, see the setting Metadata
     * destination (metadataDestination).
     * 
     * @param adiFilename
     *        Optional. Use this setting when you want the service to include an ADI file in the Nielsen metadata .zip
     *        file. To provide an ADI file, store it in Amazon S3 and provide a URL to it here. The URL should be in the
     *        following format: S3://bucket/path/ADI-file. For more information about the metadata .zip file, see the
     *        setting Metadata destination (metadataDestination).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NielsenNonLinearWatermarkSettings withAdiFilename(String adiFilename) {
        setAdiFilename(adiFilename);
        return this;
    }

    /**
     * Use the asset ID that you provide to Nielsen to uniquely identify this asset. Required for all Nielsen non-linear
     * watermarking.
     * 
     * @param assetId
     *        Use the asset ID that you provide to Nielsen to uniquely identify this asset. Required for all Nielsen
     *        non-linear watermarking.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * Use the asset ID that you provide to Nielsen to uniquely identify this asset. Required for all Nielsen non-linear
     * watermarking.
     * 
     * @return Use the asset ID that you provide to Nielsen to uniquely identify this asset. Required for all Nielsen
     *         non-linear watermarking.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * Use the asset ID that you provide to Nielsen to uniquely identify this asset. Required for all Nielsen non-linear
     * watermarking.
     * 
     * @param assetId
     *        Use the asset ID that you provide to Nielsen to uniquely identify this asset. Required for all Nielsen
     *        non-linear watermarking.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NielsenNonLinearWatermarkSettings withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * Use the asset name that you provide to Nielsen for this asset. Required for all Nielsen non-linear watermarking.
     * 
     * @param assetName
     *        Use the asset name that you provide to Nielsen for this asset. Required for all Nielsen non-linear
     *        watermarking.
     */

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    /**
     * Use the asset name that you provide to Nielsen for this asset. Required for all Nielsen non-linear watermarking.
     * 
     * @return Use the asset name that you provide to Nielsen for this asset. Required for all Nielsen non-linear
     *         watermarking.
     */

    public String getAssetName() {
        return this.assetName;
    }

    /**
     * Use the asset name that you provide to Nielsen for this asset. Required for all Nielsen non-linear watermarking.
     * 
     * @param assetName
     *        Use the asset name that you provide to Nielsen for this asset. Required for all Nielsen non-linear
     *        watermarking.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NielsenNonLinearWatermarkSettings withAssetName(String assetName) {
        setAssetName(assetName);
        return this;
    }

    /**
     * Use the CSID that Nielsen provides to you. This CBET source ID should be unique to your Nielsen account but
     * common to all of your output assets that have CBET watermarking. Required when you choose a value for the setting
     * Watermark types (ActiveWatermarkProcess) that includes CBET.
     * 
     * @param cbetSourceId
     *        Use the CSID that Nielsen provides to you. This CBET source ID should be unique to your Nielsen account
     *        but common to all of your output assets that have CBET watermarking. Required when you choose a value for
     *        the setting Watermark types (ActiveWatermarkProcess) that includes CBET.
     */

    public void setCbetSourceId(String cbetSourceId) {
        this.cbetSourceId = cbetSourceId;
    }

    /**
     * Use the CSID that Nielsen provides to you. This CBET source ID should be unique to your Nielsen account but
     * common to all of your output assets that have CBET watermarking. Required when you choose a value for the setting
     * Watermark types (ActiveWatermarkProcess) that includes CBET.
     * 
     * @return Use the CSID that Nielsen provides to you. This CBET source ID should be unique to your Nielsen account
     *         but common to all of your output assets that have CBET watermarking. Required when you choose a value for
     *         the setting Watermark types (ActiveWatermarkProcess) that includes CBET.
     */

    public String getCbetSourceId() {
        return this.cbetSourceId;
    }

    /**
     * Use the CSID that Nielsen provides to you. This CBET source ID should be unique to your Nielsen account but
     * common to all of your output assets that have CBET watermarking. Required when you choose a value for the setting
     * Watermark types (ActiveWatermarkProcess) that includes CBET.
     * 
     * @param cbetSourceId
     *        Use the CSID that Nielsen provides to you. This CBET source ID should be unique to your Nielsen account
     *        but common to all of your output assets that have CBET watermarking. Required when you choose a value for
     *        the setting Watermark types (ActiveWatermarkProcess) that includes CBET.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NielsenNonLinearWatermarkSettings withCbetSourceId(String cbetSourceId) {
        setCbetSourceId(cbetSourceId);
        return this;
    }

    /**
     * Optional. If this asset uses an episode ID with Nielsen, provide it here.
     * 
     * @param episodeId
     *        Optional. If this asset uses an episode ID with Nielsen, provide it here.
     */

    public void setEpisodeId(String episodeId) {
        this.episodeId = episodeId;
    }

    /**
     * Optional. If this asset uses an episode ID with Nielsen, provide it here.
     * 
     * @return Optional. If this asset uses an episode ID with Nielsen, provide it here.
     */

    public String getEpisodeId() {
        return this.episodeId;
    }

    /**
     * Optional. If this asset uses an episode ID with Nielsen, provide it here.
     * 
     * @param episodeId
     *        Optional. If this asset uses an episode ID with Nielsen, provide it here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NielsenNonLinearWatermarkSettings withEpisodeId(String episodeId) {
        setEpisodeId(episodeId);
        return this;
    }

    /**
     * Specify the Amazon S3 location where you want MediaConvert to save your Nielsen non-linear metadata .zip file.
     * This Amazon S3 bucket must be in the same Region as the one where you do your MediaConvert transcoding. If you
     * want to include an ADI file in this .zip file, use the setting ADI file (adiFilename) to specify it. MediaConvert
     * delivers the Nielsen metadata .zip files only to your metadata destination Amazon S3 bucket. It doesn't deliver
     * the .zip files to Nielsen. You are responsible for delivering the metadata .zip files to Nielsen.
     * 
     * @param metadataDestination
     *        Specify the Amazon S3 location where you want MediaConvert to save your Nielsen non-linear metadata .zip
     *        file. This Amazon S3 bucket must be in the same Region as the one where you do your MediaConvert
     *        transcoding. If you want to include an ADI file in this .zip file, use the setting ADI file (adiFilename)
     *        to specify it. MediaConvert delivers the Nielsen metadata .zip files only to your metadata destination
     *        Amazon S3 bucket. It doesn't deliver the .zip files to Nielsen. You are responsible for delivering the
     *        metadata .zip files to Nielsen.
     */

    public void setMetadataDestination(String metadataDestination) {
        this.metadataDestination = metadataDestination;
    }

    /**
     * Specify the Amazon S3 location where you want MediaConvert to save your Nielsen non-linear metadata .zip file.
     * This Amazon S3 bucket must be in the same Region as the one where you do your MediaConvert transcoding. If you
     * want to include an ADI file in this .zip file, use the setting ADI file (adiFilename) to specify it. MediaConvert
     * delivers the Nielsen metadata .zip files only to your metadata destination Amazon S3 bucket. It doesn't deliver
     * the .zip files to Nielsen. You are responsible for delivering the metadata .zip files to Nielsen.
     * 
     * @return Specify the Amazon S3 location where you want MediaConvert to save your Nielsen non-linear metadata .zip
     *         file. This Amazon S3 bucket must be in the same Region as the one where you do your MediaConvert
     *         transcoding. If you want to include an ADI file in this .zip file, use the setting ADI file (adiFilename)
     *         to specify it. MediaConvert delivers the Nielsen metadata .zip files only to your metadata destination
     *         Amazon S3 bucket. It doesn't deliver the .zip files to Nielsen. You are responsible for delivering the
     *         metadata .zip files to Nielsen.
     */

    public String getMetadataDestination() {
        return this.metadataDestination;
    }

    /**
     * Specify the Amazon S3 location where you want MediaConvert to save your Nielsen non-linear metadata .zip file.
     * This Amazon S3 bucket must be in the same Region as the one where you do your MediaConvert transcoding. If you
     * want to include an ADI file in this .zip file, use the setting ADI file (adiFilename) to specify it. MediaConvert
     * delivers the Nielsen metadata .zip files only to your metadata destination Amazon S3 bucket. It doesn't deliver
     * the .zip files to Nielsen. You are responsible for delivering the metadata .zip files to Nielsen.
     * 
     * @param metadataDestination
     *        Specify the Amazon S3 location where you want MediaConvert to save your Nielsen non-linear metadata .zip
     *        file. This Amazon S3 bucket must be in the same Region as the one where you do your MediaConvert
     *        transcoding. If you want to include an ADI file in this .zip file, use the setting ADI file (adiFilename)
     *        to specify it. MediaConvert delivers the Nielsen metadata .zip files only to your metadata destination
     *        Amazon S3 bucket. It doesn't deliver the .zip files to Nielsen. You are responsible for delivering the
     *        metadata .zip files to Nielsen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NielsenNonLinearWatermarkSettings withMetadataDestination(String metadataDestination) {
        setMetadataDestination(metadataDestination);
        return this;
    }

    /**
     * Use the SID that Nielsen provides to you. This source ID should be unique to your Nielsen account but common to
     * all of your output assets. Required for all Nielsen non-linear watermarking. This ID should be unique to your
     * Nielsen account but common to all of your output assets. Required for all Nielsen non-linear watermarking.
     * 
     * @param sourceId
     *        Use the SID that Nielsen provides to you. This source ID should be unique to your Nielsen account but
     *        common to all of your output assets. Required for all Nielsen non-linear watermarking. This ID should be
     *        unique to your Nielsen account but common to all of your output assets. Required for all Nielsen
     *        non-linear watermarking.
     */

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * Use the SID that Nielsen provides to you. This source ID should be unique to your Nielsen account but common to
     * all of your output assets. Required for all Nielsen non-linear watermarking. This ID should be unique to your
     * Nielsen account but common to all of your output assets. Required for all Nielsen non-linear watermarking.
     * 
     * @return Use the SID that Nielsen provides to you. This source ID should be unique to your Nielsen account but
     *         common to all of your output assets. Required for all Nielsen non-linear watermarking. This ID should be
     *         unique to your Nielsen account but common to all of your output assets. Required for all Nielsen
     *         non-linear watermarking.
     */

    public Integer getSourceId() {
        return this.sourceId;
    }

    /**
     * Use the SID that Nielsen provides to you. This source ID should be unique to your Nielsen account but common to
     * all of your output assets. Required for all Nielsen non-linear watermarking. This ID should be unique to your
     * Nielsen account but common to all of your output assets. Required for all Nielsen non-linear watermarking.
     * 
     * @param sourceId
     *        Use the SID that Nielsen provides to you. This source ID should be unique to your Nielsen account but
     *        common to all of your output assets. Required for all Nielsen non-linear watermarking. This ID should be
     *        unique to your Nielsen account but common to all of your output assets. Required for all Nielsen
     *        non-linear watermarking.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NielsenNonLinearWatermarkSettings withSourceId(Integer sourceId) {
        setSourceId(sourceId);
        return this;
    }

    /**
     * Required. Specify whether your source content already contains Nielsen non-linear watermarks. When you set this
     * value to Watermarked (WATERMARKED), the service fails the job. Nielsen requires that you add non-linear
     * watermarking to only clean content that doesn't already have non-linear Nielsen watermarks.
     * 
     * @param sourceWatermarkStatus
     *        Required. Specify whether your source content already contains Nielsen non-linear watermarks. When you set
     *        this value to Watermarked (WATERMARKED), the service fails the job. Nielsen requires that you add
     *        non-linear watermarking to only clean content that doesn't already have non-linear Nielsen watermarks.
     * @see NielsenSourceWatermarkStatusType
     */

    public void setSourceWatermarkStatus(String sourceWatermarkStatus) {
        this.sourceWatermarkStatus = sourceWatermarkStatus;
    }

    /**
     * Required. Specify whether your source content already contains Nielsen non-linear watermarks. When you set this
     * value to Watermarked (WATERMARKED), the service fails the job. Nielsen requires that you add non-linear
     * watermarking to only clean content that doesn't already have non-linear Nielsen watermarks.
     * 
     * @return Required. Specify whether your source content already contains Nielsen non-linear watermarks. When you
     *         set this value to Watermarked (WATERMARKED), the service fails the job. Nielsen requires that you add
     *         non-linear watermarking to only clean content that doesn't already have non-linear Nielsen watermarks.
     * @see NielsenSourceWatermarkStatusType
     */

    public String getSourceWatermarkStatus() {
        return this.sourceWatermarkStatus;
    }

    /**
     * Required. Specify whether your source content already contains Nielsen non-linear watermarks. When you set this
     * value to Watermarked (WATERMARKED), the service fails the job. Nielsen requires that you add non-linear
     * watermarking to only clean content that doesn't already have non-linear Nielsen watermarks.
     * 
     * @param sourceWatermarkStatus
     *        Required. Specify whether your source content already contains Nielsen non-linear watermarks. When you set
     *        this value to Watermarked (WATERMARKED), the service fails the job. Nielsen requires that you add
     *        non-linear watermarking to only clean content that doesn't already have non-linear Nielsen watermarks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NielsenSourceWatermarkStatusType
     */

    public NielsenNonLinearWatermarkSettings withSourceWatermarkStatus(String sourceWatermarkStatus) {
        setSourceWatermarkStatus(sourceWatermarkStatus);
        return this;
    }

    /**
     * Required. Specify whether your source content already contains Nielsen non-linear watermarks. When you set this
     * value to Watermarked (WATERMARKED), the service fails the job. Nielsen requires that you add non-linear
     * watermarking to only clean content that doesn't already have non-linear Nielsen watermarks.
     * 
     * @param sourceWatermarkStatus
     *        Required. Specify whether your source content already contains Nielsen non-linear watermarks. When you set
     *        this value to Watermarked (WATERMARKED), the service fails the job. Nielsen requires that you add
     *        non-linear watermarking to only clean content that doesn't already have non-linear Nielsen watermarks.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NielsenSourceWatermarkStatusType
     */

    public NielsenNonLinearWatermarkSettings withSourceWatermarkStatus(NielsenSourceWatermarkStatusType sourceWatermarkStatus) {
        this.sourceWatermarkStatus = sourceWatermarkStatus.toString();
        return this;
    }

    /**
     * Specify the endpoint for the TIC server that you have deployed and configured in the AWS Cloud. Required for all
     * Nielsen non-linear watermarking. MediaConvert can't connect directly to a TIC server. Instead, you must use API
     * Gateway to provide a RESTful interface between MediaConvert and a TIC server that you deploy in your AWS account.
     * For more information on deploying a TIC server in your AWS account and the required API Gateway, contact Nielsen
     * support.
     * 
     * @param ticServerUrl
     *        Specify the endpoint for the TIC server that you have deployed and configured in the AWS Cloud. Required
     *        for all Nielsen non-linear watermarking. MediaConvert can't connect directly to a TIC server. Instead, you
     *        must use API Gateway to provide a RESTful interface between MediaConvert and a TIC server that you deploy
     *        in your AWS account. For more information on deploying a TIC server in your AWS account and the required
     *        API Gateway, contact Nielsen support.
     */

    public void setTicServerUrl(String ticServerUrl) {
        this.ticServerUrl = ticServerUrl;
    }

    /**
     * Specify the endpoint for the TIC server that you have deployed and configured in the AWS Cloud. Required for all
     * Nielsen non-linear watermarking. MediaConvert can't connect directly to a TIC server. Instead, you must use API
     * Gateway to provide a RESTful interface between MediaConvert and a TIC server that you deploy in your AWS account.
     * For more information on deploying a TIC server in your AWS account and the required API Gateway, contact Nielsen
     * support.
     * 
     * @return Specify the endpoint for the TIC server that you have deployed and configured in the AWS Cloud. Required
     *         for all Nielsen non-linear watermarking. MediaConvert can't connect directly to a TIC server. Instead,
     *         you must use API Gateway to provide a RESTful interface between MediaConvert and a TIC server that you
     *         deploy in your AWS account. For more information on deploying a TIC server in your AWS account and the
     *         required API Gateway, contact Nielsen support.
     */

    public String getTicServerUrl() {
        return this.ticServerUrl;
    }

    /**
     * Specify the endpoint for the TIC server that you have deployed and configured in the AWS Cloud. Required for all
     * Nielsen non-linear watermarking. MediaConvert can't connect directly to a TIC server. Instead, you must use API
     * Gateway to provide a RESTful interface between MediaConvert and a TIC server that you deploy in your AWS account.
     * For more information on deploying a TIC server in your AWS account and the required API Gateway, contact Nielsen
     * support.
     * 
     * @param ticServerUrl
     *        Specify the endpoint for the TIC server that you have deployed and configured in the AWS Cloud. Required
     *        for all Nielsen non-linear watermarking. MediaConvert can't connect directly to a TIC server. Instead, you
     *        must use API Gateway to provide a RESTful interface between MediaConvert and a TIC server that you deploy
     *        in your AWS account. For more information on deploying a TIC server in your AWS account and the required
     *        API Gateway, contact Nielsen support.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NielsenNonLinearWatermarkSettings withTicServerUrl(String ticServerUrl) {
        setTicServerUrl(ticServerUrl);
        return this;
    }

    /**
     * To create assets that have the same TIC values in each audio track, keep the default value Share TICs
     * (SAME_TICS_PER_TRACK). To create assets that have unique TIC values for each audio track, choose Use unique TICs
     * (RESERVE_UNIQUE_TICS_PER_TRACK).
     * 
     * @param uniqueTicPerAudioTrack
     *        To create assets that have the same TIC values in each audio track, keep the default value Share TICs
     *        (SAME_TICS_PER_TRACK). To create assets that have unique TIC values for each audio track, choose Use
     *        unique TICs (RESERVE_UNIQUE_TICS_PER_TRACK).
     * @see NielsenUniqueTicPerAudioTrackType
     */

    public void setUniqueTicPerAudioTrack(String uniqueTicPerAudioTrack) {
        this.uniqueTicPerAudioTrack = uniqueTicPerAudioTrack;
    }

    /**
     * To create assets that have the same TIC values in each audio track, keep the default value Share TICs
     * (SAME_TICS_PER_TRACK). To create assets that have unique TIC values for each audio track, choose Use unique TICs
     * (RESERVE_UNIQUE_TICS_PER_TRACK).
     * 
     * @return To create assets that have the same TIC values in each audio track, keep the default value Share TICs
     *         (SAME_TICS_PER_TRACK). To create assets that have unique TIC values for each audio track, choose Use
     *         unique TICs (RESERVE_UNIQUE_TICS_PER_TRACK).
     * @see NielsenUniqueTicPerAudioTrackType
     */

    public String getUniqueTicPerAudioTrack() {
        return this.uniqueTicPerAudioTrack;
    }

    /**
     * To create assets that have the same TIC values in each audio track, keep the default value Share TICs
     * (SAME_TICS_PER_TRACK). To create assets that have unique TIC values for each audio track, choose Use unique TICs
     * (RESERVE_UNIQUE_TICS_PER_TRACK).
     * 
     * @param uniqueTicPerAudioTrack
     *        To create assets that have the same TIC values in each audio track, keep the default value Share TICs
     *        (SAME_TICS_PER_TRACK). To create assets that have unique TIC values for each audio track, choose Use
     *        unique TICs (RESERVE_UNIQUE_TICS_PER_TRACK).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NielsenUniqueTicPerAudioTrackType
     */

    public NielsenNonLinearWatermarkSettings withUniqueTicPerAudioTrack(String uniqueTicPerAudioTrack) {
        setUniqueTicPerAudioTrack(uniqueTicPerAudioTrack);
        return this;
    }

    /**
     * To create assets that have the same TIC values in each audio track, keep the default value Share TICs
     * (SAME_TICS_PER_TRACK). To create assets that have unique TIC values for each audio track, choose Use unique TICs
     * (RESERVE_UNIQUE_TICS_PER_TRACK).
     * 
     * @param uniqueTicPerAudioTrack
     *        To create assets that have the same TIC values in each audio track, keep the default value Share TICs
     *        (SAME_TICS_PER_TRACK). To create assets that have unique TIC values for each audio track, choose Use
     *        unique TICs (RESERVE_UNIQUE_TICS_PER_TRACK).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NielsenUniqueTicPerAudioTrackType
     */

    public NielsenNonLinearWatermarkSettings withUniqueTicPerAudioTrack(NielsenUniqueTicPerAudioTrackType uniqueTicPerAudioTrack) {
        this.uniqueTicPerAudioTrack = uniqueTicPerAudioTrack.toString();
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
        if (getActiveWatermarkProcess() != null)
            sb.append("ActiveWatermarkProcess: ").append(getActiveWatermarkProcess()).append(",");
        if (getAdiFilename() != null)
            sb.append("AdiFilename: ").append(getAdiFilename()).append(",");
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getAssetName() != null)
            sb.append("AssetName: ").append(getAssetName()).append(",");
        if (getCbetSourceId() != null)
            sb.append("CbetSourceId: ").append(getCbetSourceId()).append(",");
        if (getEpisodeId() != null)
            sb.append("EpisodeId: ").append(getEpisodeId()).append(",");
        if (getMetadataDestination() != null)
            sb.append("MetadataDestination: ").append(getMetadataDestination()).append(",");
        if (getSourceId() != null)
            sb.append("SourceId: ").append(getSourceId()).append(",");
        if (getSourceWatermarkStatus() != null)
            sb.append("SourceWatermarkStatus: ").append(getSourceWatermarkStatus()).append(",");
        if (getTicServerUrl() != null)
            sb.append("TicServerUrl: ").append(getTicServerUrl()).append(",");
        if (getUniqueTicPerAudioTrack() != null)
            sb.append("UniqueTicPerAudioTrack: ").append(getUniqueTicPerAudioTrack());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NielsenNonLinearWatermarkSettings == false)
            return false;
        NielsenNonLinearWatermarkSettings other = (NielsenNonLinearWatermarkSettings) obj;
        if (other.getActiveWatermarkProcess() == null ^ this.getActiveWatermarkProcess() == null)
            return false;
        if (other.getActiveWatermarkProcess() != null && other.getActiveWatermarkProcess().equals(this.getActiveWatermarkProcess()) == false)
            return false;
        if (other.getAdiFilename() == null ^ this.getAdiFilename() == null)
            return false;
        if (other.getAdiFilename() != null && other.getAdiFilename().equals(this.getAdiFilename()) == false)
            return false;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getAssetName() == null ^ this.getAssetName() == null)
            return false;
        if (other.getAssetName() != null && other.getAssetName().equals(this.getAssetName()) == false)
            return false;
        if (other.getCbetSourceId() == null ^ this.getCbetSourceId() == null)
            return false;
        if (other.getCbetSourceId() != null && other.getCbetSourceId().equals(this.getCbetSourceId()) == false)
            return false;
        if (other.getEpisodeId() == null ^ this.getEpisodeId() == null)
            return false;
        if (other.getEpisodeId() != null && other.getEpisodeId().equals(this.getEpisodeId()) == false)
            return false;
        if (other.getMetadataDestination() == null ^ this.getMetadataDestination() == null)
            return false;
        if (other.getMetadataDestination() != null && other.getMetadataDestination().equals(this.getMetadataDestination()) == false)
            return false;
        if (other.getSourceId() == null ^ this.getSourceId() == null)
            return false;
        if (other.getSourceId() != null && other.getSourceId().equals(this.getSourceId()) == false)
            return false;
        if (other.getSourceWatermarkStatus() == null ^ this.getSourceWatermarkStatus() == null)
            return false;
        if (other.getSourceWatermarkStatus() != null && other.getSourceWatermarkStatus().equals(this.getSourceWatermarkStatus()) == false)
            return false;
        if (other.getTicServerUrl() == null ^ this.getTicServerUrl() == null)
            return false;
        if (other.getTicServerUrl() != null && other.getTicServerUrl().equals(this.getTicServerUrl()) == false)
            return false;
        if (other.getUniqueTicPerAudioTrack() == null ^ this.getUniqueTicPerAudioTrack() == null)
            return false;
        if (other.getUniqueTicPerAudioTrack() != null && other.getUniqueTicPerAudioTrack().equals(this.getUniqueTicPerAudioTrack()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActiveWatermarkProcess() == null) ? 0 : getActiveWatermarkProcess().hashCode());
        hashCode = prime * hashCode + ((getAdiFilename() == null) ? 0 : getAdiFilename().hashCode());
        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getAssetName() == null) ? 0 : getAssetName().hashCode());
        hashCode = prime * hashCode + ((getCbetSourceId() == null) ? 0 : getCbetSourceId().hashCode());
        hashCode = prime * hashCode + ((getEpisodeId() == null) ? 0 : getEpisodeId().hashCode());
        hashCode = prime * hashCode + ((getMetadataDestination() == null) ? 0 : getMetadataDestination().hashCode());
        hashCode = prime * hashCode + ((getSourceId() == null) ? 0 : getSourceId().hashCode());
        hashCode = prime * hashCode + ((getSourceWatermarkStatus() == null) ? 0 : getSourceWatermarkStatus().hashCode());
        hashCode = prime * hashCode + ((getTicServerUrl() == null) ? 0 : getTicServerUrl().hashCode());
        hashCode = prime * hashCode + ((getUniqueTicPerAudioTrack() == null) ? 0 : getUniqueTicPerAudioTrack().hashCode());
        return hashCode;
    }

    @Override
    public NielsenNonLinearWatermarkSettings clone() {
        try {
            return (NielsenNonLinearWatermarkSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.NielsenNonLinearWatermarkSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
