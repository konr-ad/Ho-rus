package pl.wall;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {
    private List<Block> blocks = new ArrayList<>();
    private String material;
    private String color;

    public Wall(String material, String color) {
        this.material = material;
        this.color = color;
    }

    // Aby nie tworzyć listy w klasie Main
    public void addBlock(Block block) {
        blocks.add(block);
    }

    @Override
    public List getBlocks() {
        return blocks;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Optional<String> findBlockByColor(String color) {
        return Optional.ofNullable(color);
    }

    @Override
    public List findBlocksByMaterial(String material) {
        for (Block block : blocks
                .stream()
                .filter(c -> c.getMaterial().equals(material))
                .collect(Collectors.toList())) {
            
        }

        return blocks;
    }

    @Override
    public int count() {
        return blocks.size();
    }

}
