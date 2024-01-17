package com.rmsoft.service;

import com.rmsoft.mapper.SubscribeMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class SubscribeService {

    private final SubscribeMapper mapper;

    /*// 서비스 사용현황 조회
    public PageResponseDTO findByParentAndCate(PageRequestDTO pageRequestDTO){

        Pageable pageable = pageRequestDTO.getPageable("no");

         Page<ArticleEntity> result = mapper.findByParentAndCate(0, pageRequestDTO.getCate(), pageable);

         List<ArticleDTO> dotList = result.getContent()
                                             .stream()
                                             .map(entity ->modelMapper.map(entity,ArticleDTO.class))
                                             .toList(); //10 개의 List
         int totalElement = (int) result.getTotalElements(); //entity의 개수
         return PageResponseDTO.builder()
                 .pageRequestDTO(pageRequestDTO)
                 .dtoList(dotList)
                 .total(totalElement)
                 .build();
    }*/
    
    /*// 글등록
    public void save(ArticleDTO dto){

        ArticleEntity savedEntity = articleRepository.save(dto.toEntity());

        // 파일업로드
        FileDTO fileDTO = fileUpload(dto);
        
        // 파일 DB에 추가
        if(fileDTO!= null){
            // 파일 등록
            fileDTO.setAno(savedEntity.getNo());
            fileRepository.save(fileDTO.toEntity());

            int count = fileRepository.countByAno(savedEntity.getNo());
            savedEntity.setFile(count);
            articleRepository.save(savedEntity);
        }
    }

    @Value("${spring.servlet.multipart.location}")
    private String filePath;

    public FileDTO fileUpload(ArticleDTO dto) {
        MultipartFile mf = dto.getFname();
        if(!mf.isEmpty()){          // 파일 첨부했을 경우
            // 절대경로 찾기
            String path = new File(filePath).getAbsolutePath();

            String oName = mf.getOriginalFilename();
            String ext = oName.substring(oName.lastIndexOf("."));
            String sName = UUID.randomUUID().toString()+ext;

            try {
                mf.transferTo(new File(path, sName));
            } catch (IOException e) {
                log.error(e.getMessage());
            }

            return FileDTO.builder().oriName(oName).newName(sName).build();

        }
        return null;
    }*/
}
