package impl;

import com.stream.app.entities.Video;
import com.stream.app.service.VideoService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class VideoServiceImpl implements VideoService {
    @Override
    public Video save(Video video, MultipartFile file) {
        return null;
    }

    @Override
    public Video get(String videoId) {
        return null;
    }

    @Override
    public Video getByTitle(String title) {
        return null;
    }

    @Override
    public List<Video> getAll() {
        return List.of();
    }
}
