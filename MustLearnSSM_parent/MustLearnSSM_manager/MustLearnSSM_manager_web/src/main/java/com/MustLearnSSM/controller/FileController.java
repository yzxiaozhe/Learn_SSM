package com.MustLearnSSM.controller;

import com.MustLearnSSM.fastdfs.FastDFSClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @Author: xiaozhe
 * @Date: 2019/8/14 22:53
 */

@Controller
public class FileController {
    
    @RequestMapping(value = "uploadfile",method = RequestMethod.POST)
    @ResponseBody
    public String fileupload(@RequestParam MultipartFile uploadfile) throws IOException {
        String fileid=FastDFSClient.uploadFile(uploadfile.getInputStream(),uploadfile.getOriginalFilename());
        
        if (fileid!=null){
            System.out.println("上传成功");
        }
        
       
        return fileid+"---"+uploadfile.getOriginalFilename();
    }
}
