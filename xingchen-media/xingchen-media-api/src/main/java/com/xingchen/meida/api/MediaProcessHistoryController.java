package com.xingchen.meida.api;

import com.xingchen.media.service.MediaProcessHistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xingchen
 */
@Slf4j
@RestController
@RequestMapping("mediaProcessHistory")
public class MediaProcessHistoryController {

    @Autowired
    private MediaProcessHistoryService  mediaProcessHistoryService;
}
