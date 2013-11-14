/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elastictranscoder.model.transform;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Create Job Request Marshaller
 */
public class CreateJobRequestMarshaller implements Marshaller<Request<CreateJobRequest>, CreateJobRequest> {

    

    public Request<CreateJobRequest> marshall(CreateJobRequest createJobRequest) {
    if (createJobRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<CreateJobRequest> request = new DefaultRequest<CreateJobRequest>(createJobRequest, "AmazonElasticTranscoder");
        String target = "EtsCustomerService.CreateJob";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.0");

        
        request.setHttpMethod(HttpMethodName.POST);


        String uriResourcePath = "2012-09-25/jobs"; 

        uriResourcePath = uriResourcePath.replaceAll("//", "/");

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    request.addParameter(nameValuePair[0], nameValuePair[1]);
                } else {
                    request.addParameter(s, null);
                }
            }
        }

        request.setResourcePath(uriResourcePath);


        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          
            
          jsonWriter.object();
          
            if (createJobRequest.getPipelineId() != null) {
                jsonWriter.key("PipelineId").value(createJobRequest.getPipelineId());
            }
            JobInput input = createJobRequest.getInput();
            if (input != null) {

                jsonWriter.key("Input");
                jsonWriter.object();

                if (input.getKey() != null) {
                    jsonWriter.key("Key").value(input.getKey());
                }
                if (input.getFrameRate() != null) {
                    jsonWriter.key("FrameRate").value(input.getFrameRate());
                }
                if (input.getResolution() != null) {
                    jsonWriter.key("Resolution").value(input.getResolution());
                }
                if (input.getAspectRatio() != null) {
                    jsonWriter.key("AspectRatio").value(input.getAspectRatio());
                }
                if (input.getInterlaced() != null) {
                    jsonWriter.key("Interlaced").value(input.getInterlaced());
                }
                if (input.getContainer() != null) {
                    jsonWriter.key("Container").value(input.getContainer());
                }
                jsonWriter.endObject();
            }
            CreateJobOutput output = createJobRequest.getOutput();
            if (output != null) {

                jsonWriter.key("Output");
                jsonWriter.object();

                if (output.getKey() != null) {
                    jsonWriter.key("Key").value(output.getKey());
                }
                if (output.getThumbnailPattern() != null) {
                    jsonWriter.key("ThumbnailPattern").value(output.getThumbnailPattern());
                }
                if (output.getRotate() != null) {
                    jsonWriter.key("Rotate").value(output.getRotate());
                }
                if (output.getPresetId() != null) {
                    jsonWriter.key("PresetId").value(output.getPresetId());
                }
                if (output.getSegmentDuration() != null) {
                    jsonWriter.key("SegmentDuration").value(output.getSegmentDuration());
                }

                com.amazonaws.internal.ListWithAutoConstructFlag<JobWatermark> watermarksList = (com.amazonaws.internal.ListWithAutoConstructFlag<JobWatermark>)(output.getWatermarks());
                if (watermarksList != null && !(watermarksList.isAutoConstruct() && watermarksList.isEmpty())) {

                    jsonWriter.key("Watermarks");
                    jsonWriter.array();

                    for (JobWatermark watermarksListValue : watermarksList) {
                        if (watermarksListValue != null) {
                            jsonWriter.object();
                            if (watermarksListValue.getPresetWatermarkId() != null) {
                                jsonWriter.key("PresetWatermarkId").value(watermarksListValue.getPresetWatermarkId());
                            }
                            if (watermarksListValue.getInputKey() != null) {
                                jsonWriter.key("InputKey").value(watermarksListValue.getInputKey());
                            }
                            jsonWriter.endObject();
                        }
                    }
                    jsonWriter.endArray();
                }
                JobAlbumArt albumArt = output.getAlbumArt();
                if (albumArt != null) {

                    jsonWriter.key("AlbumArt");
                    jsonWriter.object();

                    if (albumArt.getMergePolicy() != null) {
                        jsonWriter.key("MergePolicy").value(albumArt.getMergePolicy());
                    }

                    com.amazonaws.internal.ListWithAutoConstructFlag<Artwork> artworkList = (com.amazonaws.internal.ListWithAutoConstructFlag<Artwork>)(albumArt.getArtwork());
                    if (artworkList != null && !(artworkList.isAutoConstruct() && artworkList.isEmpty())) {

                        jsonWriter.key("Artwork");
                        jsonWriter.array();

                        for (Artwork artworkListValue : artworkList) {
                            if (artworkListValue != null) {
                                jsonWriter.object();
                                if (artworkListValue.getInputKey() != null) {
                                    jsonWriter.key("InputKey").value(artworkListValue.getInputKey());
                                }
                                if (artworkListValue.getMaxWidth() != null) {
                                    jsonWriter.key("MaxWidth").value(artworkListValue.getMaxWidth());
                                }
                                if (artworkListValue.getMaxHeight() != null) {
                                    jsonWriter.key("MaxHeight").value(artworkListValue.getMaxHeight());
                                }
                                if (artworkListValue.getSizingPolicy() != null) {
                                    jsonWriter.key("SizingPolicy").value(artworkListValue.getSizingPolicy());
                                }
                                if (artworkListValue.getPaddingPolicy() != null) {
                                    jsonWriter.key("PaddingPolicy").value(artworkListValue.getPaddingPolicy());
                                }
                                if (artworkListValue.getAlbumArtFormat() != null) {
                                    jsonWriter.key("AlbumArtFormat").value(artworkListValue.getAlbumArtFormat());
                                }
                                jsonWriter.endObject();
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                }

                com.amazonaws.internal.ListWithAutoConstructFlag<Clip> compositionList = (com.amazonaws.internal.ListWithAutoConstructFlag<Clip>)(output.getComposition());
                if (compositionList != null && !(compositionList.isAutoConstruct() && compositionList.isEmpty())) {

                    jsonWriter.key("Composition");
                    jsonWriter.array();

                    for (Clip compositionListValue : compositionList) {
                        if (compositionListValue != null) {
                            jsonWriter.object();
                            TimeSpan timeSpan = compositionListValue.getTimeSpan();
                            if (timeSpan != null) {

                                jsonWriter.key("TimeSpan");
                                jsonWriter.object();

                                if (timeSpan.getStartTime() != null) {
                                    jsonWriter.key("StartTime").value(timeSpan.getStartTime());
                                }
                                if (timeSpan.getDuration() != null) {
                                    jsonWriter.key("Duration").value(timeSpan.getDuration());
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endObject();
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<CreateJobOutput> outputsList = (com.amazonaws.internal.ListWithAutoConstructFlag<CreateJobOutput>)(createJobRequest.getOutputs());
            if (outputsList != null && !(outputsList.isAutoConstruct() && outputsList.isEmpty())) {

                jsonWriter.key("Outputs");
                jsonWriter.array();

                for (CreateJobOutput outputsListValue : outputsList) {
                    if (outputsListValue != null) {
                        jsonWriter.object();
                        if (outputsListValue.getKey() != null) {
                            jsonWriter.key("Key").value(outputsListValue.getKey());
                        }
                        if (outputsListValue.getThumbnailPattern() != null) {
                            jsonWriter.key("ThumbnailPattern").value(outputsListValue.getThumbnailPattern());
                        }
                        if (outputsListValue.getRotate() != null) {
                            jsonWriter.key("Rotate").value(outputsListValue.getRotate());
                        }
                        if (outputsListValue.getPresetId() != null) {
                            jsonWriter.key("PresetId").value(outputsListValue.getPresetId());
                        }
                        if (outputsListValue.getSegmentDuration() != null) {
                            jsonWriter.key("SegmentDuration").value(outputsListValue.getSegmentDuration());
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<JobWatermark> watermarksList = (com.amazonaws.internal.ListWithAutoConstructFlag<JobWatermark>)(outputsListValue.getWatermarks());
                        if (watermarksList != null && !(watermarksList.isAutoConstruct() && watermarksList.isEmpty())) {

                            jsonWriter.key("Watermarks");
                            jsonWriter.array();

                            for (JobWatermark watermarksListValue : watermarksList) {
                                if (watermarksListValue != null) {
                                    jsonWriter.object();
                                    if (watermarksListValue.getPresetWatermarkId() != null) {
                                        jsonWriter.key("PresetWatermarkId").value(watermarksListValue.getPresetWatermarkId());
                                    }
                                    if (watermarksListValue.getInputKey() != null) {
                                        jsonWriter.key("InputKey").value(watermarksListValue.getInputKey());
                                    }
                                    jsonWriter.endObject();
                                }
                            }
                            jsonWriter.endArray();
                        }
                        JobAlbumArt albumArt = outputsListValue.getAlbumArt();
                        if (albumArt != null) {

                            jsonWriter.key("AlbumArt");
                            jsonWriter.object();

                            if (albumArt.getMergePolicy() != null) {
                                jsonWriter.key("MergePolicy").value(albumArt.getMergePolicy());
                            }

                            com.amazonaws.internal.ListWithAutoConstructFlag<Artwork> artworkList = (com.amazonaws.internal.ListWithAutoConstructFlag<Artwork>)(albumArt.getArtwork());
                            if (artworkList != null && !(artworkList.isAutoConstruct() && artworkList.isEmpty())) {

                                jsonWriter.key("Artwork");
                                jsonWriter.array();

                                for (Artwork artworkListValue : artworkList) {
                                    if (artworkListValue != null) {
                                        jsonWriter.object();
                                        if (artworkListValue.getInputKey() != null) {
                                            jsonWriter.key("InputKey").value(artworkListValue.getInputKey());
                                        }
                                        if (artworkListValue.getMaxWidth() != null) {
                                            jsonWriter.key("MaxWidth").value(artworkListValue.getMaxWidth());
                                        }
                                        if (artworkListValue.getMaxHeight() != null) {
                                            jsonWriter.key("MaxHeight").value(artworkListValue.getMaxHeight());
                                        }
                                        if (artworkListValue.getSizingPolicy() != null) {
                                            jsonWriter.key("SizingPolicy").value(artworkListValue.getSizingPolicy());
                                        }
                                        if (artworkListValue.getPaddingPolicy() != null) {
                                            jsonWriter.key("PaddingPolicy").value(artworkListValue.getPaddingPolicy());
                                        }
                                        if (artworkListValue.getAlbumArtFormat() != null) {
                                            jsonWriter.key("AlbumArtFormat").value(artworkListValue.getAlbumArtFormat());
                                        }
                                        jsonWriter.endObject();
                                    }
                                }
                                jsonWriter.endArray();
                            }
                            jsonWriter.endObject();
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<Clip> compositionList = (com.amazonaws.internal.ListWithAutoConstructFlag<Clip>)(outputsListValue.getComposition());
                        if (compositionList != null && !(compositionList.isAutoConstruct() && compositionList.isEmpty())) {

                            jsonWriter.key("Composition");
                            jsonWriter.array();

                            for (Clip compositionListValue : compositionList) {
                                if (compositionListValue != null) {
                                    jsonWriter.object();
                                    TimeSpan timeSpan = compositionListValue.getTimeSpan();
                                    if (timeSpan != null) {

                                        jsonWriter.key("TimeSpan");
                                        jsonWriter.object();

                                        if (timeSpan.getStartTime() != null) {
                                            jsonWriter.key("StartTime").value(timeSpan.getStartTime());
                                        }
                                        if (timeSpan.getDuration() != null) {
                                            jsonWriter.key("Duration").value(timeSpan.getDuration());
                                        }
                                        jsonWriter.endObject();
                                    }
                                    jsonWriter.endObject();
                                }
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }
            if (createJobRequest.getOutputKeyPrefix() != null) {
                jsonWriter.key("OutputKeyPrefix").value(createJobRequest.getOutputKeyPrefix());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<CreateJobPlaylist> playlistsList = (com.amazonaws.internal.ListWithAutoConstructFlag<CreateJobPlaylist>)(createJobRequest.getPlaylists());
            if (playlistsList != null && !(playlistsList.isAutoConstruct() && playlistsList.isEmpty())) {

                jsonWriter.key("Playlists");
                jsonWriter.array();

                for (CreateJobPlaylist playlistsListValue : playlistsList) {
                    if (playlistsListValue != null) {
                        jsonWriter.object();
                        if (playlistsListValue.getName() != null) {
                            jsonWriter.key("Name").value(playlistsListValue.getName());
                        }
                        if (playlistsListValue.getFormat() != null) {
                            jsonWriter.key("Format").value(playlistsListValue.getFormat());
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<String> outputKeysList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(playlistsListValue.getOutputKeys());
                        if (outputKeysList != null && !(outputKeysList.isAutoConstruct() && outputKeysList.isEmpty())) {

                            jsonWriter.key("OutputKeys");
                            jsonWriter.array();

                            for (String outputKeysListValue : outputKeysList) {
                                if (outputKeysListValue != null) {
                                    jsonWriter.value(outputKeysListValue);
                                }
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }

          jsonWriter.endObject();
          

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes("UTF-8");
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        

        return request;
    }
}
